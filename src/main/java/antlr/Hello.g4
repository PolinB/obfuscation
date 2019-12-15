// Define a grammar called Hello
grammar Hello;

start
    locals [java.util.HashMap<String, String> variables, int index, boolean connectedIostream, boolean connectedStd]
    @init{
        $variables = new java.util.HashMap<>();
        $index = 10;
        $connectedIostream = false;
        $connectedStd = false;
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
         INCLUDE_NAME {
            if (($INCLUDE_NAME.text).equals("<iostream>")) {
                $start::connectedIostream = true;
            }
            $sb.append($INCLUDE_NAME.text).append("\n");
         })*
         (usingLine {
            $start::connectedStd = true;
            $sb.append("\n").append($usingLine.sb.toString());
         })?
         MAIN {$sb.append("\n").append($MAIN.text).append(" ");}
         LPF {$sb.append($LPF.text).append("\n");}
         body {$sb.append($body.sb.toString());}
         RPF {$sb.append($RPF.text);};

body
    returns [StringBuilder sb]
    @init {
        $sb = new StringBuilder();
    }
    : (line {$sb.append($line.sb.toString()).append("\n");})*;

line
    returns [StringBuilder sb]
    @init {
        $sb = new StringBuilder();
    }
    : variableDeclaration {
        $sb.append($variableDeclaration.sb.toString());
    }
    | variableChange {
        $sb.append($variableChange.sb.toString());
    };

variableDeclaration
    returns [StringBuilder sb]
    @init {
        $sb = new StringBuilder();
    }
    : type {
        $sb.append($type.sb.toString()).append(" ");
    } VARIABLE_NAME {
        String variableName = $VARIABLE_NAME.text;
        if ($start::variables.containsKey(variableName)) {
            throw new RuntimeException("Re-declaring a variable.");
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
            $start::variables.put(variableName, newName);
            $sb.append(newName);
            $start::index++;
        }
    } EQ {
        $sb.append(" = ");
    } rightPart {
        $sb.append($rightPart.sb.toString());
    };

rightPart
    returns [StringBuilder sb]
    @init {
        $sb = new StringBuilder();
    }
    : integerOrVariableInRightPart {
        $sb.append($integerOrVariableInRightPart.sb.toString());
    } SEMICLONE {
        $sb.append($SEMICLONE.text);
    };

variableChange
    returns [StringBuilder sb]
    @init {
        $sb = new StringBuilder();
    }
    : VARIABLE_NAME {
        String variableName = $VARIABLE_NAME.text;
        if ($start::variables.containsKey(variableName)) {
            $sb.append($start::variables.get(variableName));
        } else {
            throw new RuntimeException("Unknown variable in left part.");
        }
    } EQ {
        $sb.append(" = ");
    } rightPart {
        $sb.append($rightPart.sb.toString());
    };

integerOrVariableInRightPart
    returns [StringBuilder sb]
    @init {
        $sb = new StringBuilder();
    }
    : INTEGER {
        $sb.append($INTEGER.text);
    }
    | VARIABLE_NAME {
        String variableName = $VARIABLE_NAME.text;
        if ($start::variables.containsKey(variableName)) {
            $sb.append($start::variables.get(variableName));
        } else {
            throw new RuntimeException("Unknown variable in right part.");
        }
    };

type
    returns [StringBuilder sb]
    @init {
        $sb = new StringBuilder();
    }
    : LONG {$sb.append($LONG.text);}
    | LONGLONG {$sb.append($LONGLONG.text);}
    | INT {$sb.append($INT.text);}
    | BOOL {$sb.append($BOOL.text);}
    | VOID {$sb.append($VOID.text);};

usingLine
    returns [StringBuilder sb]
    @init {
        $sb = new StringBuilder();
    }
    : USING {$sb.append($USING.text).append(" ");}
    NAMESPACE {$sb.append($NAMESPACE.text).append(" ");}
    STD {$sb.append($STD.text);}
    SEMICLONE {$sb.append($SEMICLONE.text).append("\n");};

USING: 'using';
NAMESPACE: 'namespace';
STD: 'std';
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
VARIABLE_NAME: [a-zA-Z][a-zA-Z0-9_]*;
WS: [ \t\n]+ -> skip;
