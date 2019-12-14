// Define a grammar called Hello
grammar Hello;

start
    locals [java.util.HashMap<String, String> variables, int index]
    @init{
        $variables = new java.util.HashMap<>();
        $index = 10;
    }
    : program {
        StringBuilder sb = new StringBuilder();
        sb.append($program.sb.toString());
        System.out.println(sb.toString());
    } EOF;

program
    returns [StringBuilder sb]
        @init {
            $sb = new StringBuilder();
        }
        : (INCLUDE {$sb.append($INCLUDE.text).append(" ");}
         INCLUDE_NAME {$sb.append($INCLUDE_NAME.text).append("\n");})*
         MAIN {$sb.append("\n").append($MAIN.text).append(" ");}
         LPF {$sb.append($LPF.text).append("\n");}
         body {$sb.append($body.sb.toString());}
         RPF {$sb.append($RPF.text);};

body
    returns [StringBuilder sb]
    @init {
        $sb = new StringBuilder();
    }
    : (expression {$sb.append($expression.sb.toString()).append("\n");})*;

expression
    returns [StringBuilder sb]
    @init {
        $sb = new StringBuilder();
    }
    : type {
        $sb.append($type.sb.toString()).append(" ");
    } VARIABLE_NAME {
        String variableName = $VARIABLE_NAME.text;
        if ($start::variables.containsKey(variableName)) {
            $sb.append($start::variables.get(variableName));
        } else {
            int curNumber = ($start::index) / 2;
            StringBuilder name = new StringBuilder();
            while (curNumber != 0) {
                switch (curNumber % 4) {
                    case 0:
                        name.insert(0, Integer.toString(0));
                        break;
                    case 1:
                        name.insert(0, 'O');
                        break;
                    case 2:
                        name.insert(0, Integer.toString(1));
                        break;
                    case 3:
                        name.insert(0, 'I');
                        break;
                }
                curNumber /= 4;
            }
            if (($start::index) % 2 == 0) {
                name.insert(0, 'O');
            } else {
                name.insert(0, 'I');
            }
            String newName = name.toString();
            $start::variables.put(variableName, newName/*Integer.toString($start::index)*/);
            $sb.append(newName/*Integer.toString($start::index)*/);
            $start::index++;
        }
    } EQ {
        $sb.append(" = ");
    } INTEGER {
        $sb.append($INTEGER.text);
    } SEMICLONE {
        $sb.append($SEMICLONE.text);
    };

type
    returns [StringBuilder sb]
    @init {
        $sb = new StringBuilder();
    }: LONG {$sb.append($LONG.text);}
    | LONGLONG {$sb.append($LONGLONG.text);}
    | INT {$sb.append($INT.text);}
    | BOOL {$sb.append($BOOL.text);}
    | VOID {$sb.append($VOID.text);};


SEMICLONE : ';';
LONG : 'long';
LONGLONG : 'long long';
INT : 'int';
BOOL : 'bool';
VOID: 'void';
RETURN: 'return';
WHILE: 'while';
DO: 'do';
FOR: 'for';
EQ : '=';
INTEGER: ('-')?[1-9][0-9]*;
INCLUDE: '#include';
INCLUDE_NAME: '<' [a-zA-Z] [_\\.a-zA-Z]* '>';
MAIN: 'int main()';
LPF: '{';
RPF: '}';
VARIABLE_NAME : [a-zA-Z][a-zA-Z0-9_]*;
WS : [ \t\n]+ -> skip;
