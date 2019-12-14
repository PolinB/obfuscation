// Define a grammar called Hello
grammar Hello;

start
    locals [java.util.HashMap<String, String> variables, int index]
    @init{
        $variables = new java.util.HashMap<>();
        $index = 0;
    }
    : body {
        StringBuilder sb = new StringBuilder();
        sb.append("#include <iostream>\nint main() {\n").append($body.sb.toString()).append("}");
        System.out.println(sb.toString());
    } EOF;

body
    returns [StringBuilder sb]
    @init {
        $sb = new StringBuilder();
    }: (expression {$sb.append($expression.sb.toString()).append("\n");})*;

expression
    returns [StringBuilder sb]
    @init {
        $sb = new StringBuilder();
    }: type {
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
VARIABLE_NAME : [a-zA-Z][a-zA-Z0-9_]*;
WS : [ \t\n]+ -> skip;
