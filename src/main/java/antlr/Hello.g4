// Define a grammar called Hello
grammar Hello;

@header {
    import java.util.*;
}

@members {
    private static Random random = new Random();

    private static int getRandom() {
        int x = random.nextInt();
        return x > 0 ? x : -x;
    }

    private static String addNewVariable(ArrayList<String> addedVariables, ArrayList<String> variables, int index) {
        StringBuilder sb = new StringBuilder();
        int randOp = getRandom() % 3;
        String type = getType(getRandom());
        String name = getVariableName(index);
        String rightPart = "";
        switch (randOp) {
            case 0: {
                if (addedVariables.size() == 0) {
                    rightPart = Integer.toString(getRandom() % 1000);
                } else {
                    rightPart = addedVariables.get(getRandom() % addedVariables.size());
                }
                break;
            }
            case 1: {
                if (variables.size() == 0) {
                    rightPart = Integer.toString(getRandom() % 1000);
                } else {
                    rightPart = variables.get(getRandom() % variables.size());
                }
                break;
            }
            case 2: {
                rightPart = Integer.toString(getRandom() % 1000);
            }
        }
        sb.append(type).append(" ").append(name).append(" = ").append(rightPart).append(";");
        addedVariables.add(name);
        return sb.toString();
    }

    private static String addActionWithVariable(ArrayList<String> addedVariables, ArrayList<String> variables) {
        StringBuilder sb = new StringBuilder();
        int randOp = getRandom() % 3;
        String name = addedVariables.get(getRandom() % addedVariables.size());
        String rightPart = "";
        switch (randOp) {
            case 0: {
                rightPart = addedVariables.get(getRandom() % addedVariables.size());
                break;
            }
            case 1: {
                if (variables.size() == 0) {
                    rightPart = Integer.toString(getRandom() % 1000);
                } else {
                    rightPart = addedVariables.get(getRandom() % addedVariables.size());
                }
                break;
            }
            case 2: {
                rightPart = Integer.toString(getRandom() % 1000);
            }
        }
        sb.append(name).append(" = ").append(rightPart).append(";");

        return sb.toString();
    }

    private static String getVariableName(int index) {
        int curNumber = index / 2;
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
        if (index % 2 == 0) {
            name.insert(0, 'O');
        } else {
            name.insert(0, 'I');
        }
        return name.toString();
    }

    private static String getType(int ind) {
        ind %= 4;
        switch (ind) {
            case 0:
                return "long";
            case 1:
                return "long long";
            case 2:
                return "int";
            case 3:
                return "bool";
        }
        return "";
    }
}

start
    locals [HashMap<String, String> variables,
            int index,
            boolean connectedIostream,
            boolean connectedStd,
            boolean hasReturn]
    @init{
        $variables = new HashMap<>();
        $index = 10;
        $connectedIostream = false;
        $connectedStd = false;
        $hasReturn = false;
    }
    : program {
        StringBuilder sb = new StringBuilder();
        sb.append($program.sb.toString());
        try(java.io.FileOutputStream fos=new java.io.FileOutputStream("/home/polinb/IdeaProjects/Test/results/example.cpp")) {
            byte[] buffer = sb.toString().getBytes();
            fos.write(buffer, 0, buffer.length);
        } catch (java.io.IOException ex){
            System.out.println(ex.getMessage());
        }
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
         body {
            if (!$body.hasReturn) {
                throw new RuntimeException("Forgot return.");
            }
            $sb.append($body.sb.toString());
         }
         RPF {$sb.append($RPF.text);};

body
    returns [StringBuilder sb, boolean hasReturn]
    locals [ArrayList<String> addedVariables]
    @init {
        $sb = new StringBuilder();
        $hasReturn = false;
        $addedVariables = new ArrayList<>();
    }
    : (line {
        $sb.append($line.sb.toString()).append("\n");
        ArrayList<String> values = new ArrayList<>($start::variables.values());
        int linesNum = (getRandom() % 7);
        for (int i = 0; i < linesNum; ++i) {
            String line = "";
            if (getRandom() % 2 == 0) {
                line = addNewVariable($body::addedVariables, values, $start::index);
                ++$start::index;
            } else if (!$body::addedVariables.isEmpty()) {
                line = addActionWithVariable($body::addedVariables, values);
            }
            if (!line.isEmpty()) {
                $sb.append(line).append("\n");
            }
        }
        if ($line.hasReturn) {
            $hasReturn = true;
        }
    }
    | ifBlock {
        $sb.append($ifBlock.sb.toString());
    }
    | whileBlock {
        $sb.append($whileBlock.sb.toString());
    })*;

line
    returns [StringBuilder sb, boolean hasReturn]
    @init {
        $sb = new StringBuilder();
        $hasReturn = false;
    }
    : (variableDeclaration {
        $sb.append($variableDeclaration.sb.toString());
    }
    | variableChange {
        $sb.append($variableChange.sb.toString());
    }
    | cinLine {
        $sb.append($cinLine.sb.toString());
    }
    | coutLine {
        $sb.append($coutLine.sb.toString());
    }
    | returnLine {
        $sb.append($returnLine.sb.toString());
        $hasReturn = true;
    }) SEMICLONE {
        $sb.append($SEMICLONE.text);
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
            String newName = getVariableName($start::index);
            $start::variables.put(variableName, newName);
            $sb.append(newName);
            $start::index++;
        }
    } (EQ {
        $sb.append(" = ");
    } rightPart {
        $sb.append($rightPart.sb.toString());
    })?;

rightPart
    returns [StringBuilder sb]
    @init {
        $sb = new StringBuilder();
    }
    : integerOrVariableInRightPart {
        $sb.append($integerOrVariableInRightPart.sb.toString());
    }
    | expression {
        $sb.append($expression.sb.toString());
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
    | boolValue {
        $sb.append($boolValue.sb.toString());
    }
    | variableInRightPart {
        $sb.append($variableInRightPart.sb.toString());
    };

variableInRightPart
    returns [StringBuilder sb]
    @init {
        $sb = new StringBuilder();
    }
    : VARIABLE_NAME {
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
    | BOOL {$sb.append($BOOL.text);};

usingLine
    returns [StringBuilder sb]
    @init {
        $sb = new StringBuilder();
    }
    : USING {$sb.append($USING.text).append(" ");}
    NAMESPACE {$sb.append($NAMESPACE.text).append(" ");}
    STD {$sb.append($STD.text);}
    SEMICLONE {
        $sb.append($SEMICLONE.text).append("\n");
    };

cinLine
    returns [StringBuilder sb]
    locals [boolean hasStd]
    @init {
        $sb = new StringBuilder();
        $hasStd = false;
    }
    : (STD DCOLON {
        $sb.append($STD.text).append($DCOLON.text);
        $cinLine::hasStd = true;
    })? CIN {
        if (!$start::connectedIostream) {
            throw new RuntimeException("Forgot to connect iostream.");
        }
        if (!$cinLine::hasStd && !$start::connectedStd) {
            throw new RuntimeException("Forgot to connect std.");
        }
        $sb.append($CIN.text);
    } (DRIGHT {
        $sb.append(" ").append($DRIGHT.text).append(" ");
    } variableInRightPart {
        $sb.append($variableInRightPart.sb.toString());
    })+;

coutLine
    returns [StringBuilder sb]
    locals [boolean hasStd]
    @init {
        $sb = new StringBuilder();
        $hasStd = false;
    }
    : (STD DCOLON {
        $sb.append($STD.text).append($DCOLON.text);
        $coutLine::hasStd = true;
    })? COUT {
        if (!$start::connectedIostream) {
            throw new RuntimeException("Forgot to connect iostream.");
        }
        if (!$coutLine::hasStd && !$start::connectedStd) {
            throw new RuntimeException("Forgot to connect std.");
        }
        $sb.append($COUT.text);
    } (DLEFT {
        $sb.append(" ").append($DLEFT.text).append(" ");
    } (integerOrVariableInRightPart {
        $sb.append($integerOrVariableInRightPart.sb.toString());
    } | ENDL {
        if (!$coutLine::hasStd && !$start::connectedStd) {
            throw new RuntimeException("Forgot to connect std.");
        }
        $sb.append($ENDL.text);
    }))+;

returnLine
    returns [StringBuilder sb]
    @init {
        $sb = new StringBuilder();
    }
    : RETURN {
        $sb.append($RETURN.text).append(" ");
    } integerOrVariableInRightPart {
        $sb.append($integerOrVariableInRightPart.sb.toString());
    };

expression
    returns [StringBuilder sb]
    @init {
        $sb = new StringBuilder();
    }
    : addExpression {
        $sb.append($addExpression.sb.toString());
    }
    | addExpression expressionPart {
        $sb.append($addExpression.sb.toString()).append($expressionPart.sb.toString());
    };

expressionPart
    returns [StringBuilder sb]
    @init {
        $sb = new StringBuilder();
    }
    : PLUS addExpression {
        $sb.append(" ").append($PLUS.text).append(" ").append($addExpression.sb.toString());
    }
    | PLUS addExpression expressionPart {
        $sb.append(" ").append($PLUS.text).append(" ").append($addExpression.sb.toString()).append($expressionPart.sb.toString());
    };

addExpression
    returns [StringBuilder sb]
    @init {
        $sb = new StringBuilder();
    }
    : mulExpression {
        $sb.append($mulExpression.sb.toString());
    }
    | mulExpression addExpressionPart {
        $sb.append($mulExpression.sb.toString()).append($addExpressionPart.sb.toString());
    };

addExpressionPart
    returns [StringBuilder sb]
    @init {
        $sb = new StringBuilder();
    }
    : MUL mulExpression {
        $sb.append(" ").append($MUL.text).append(" ").append($mulExpression.sb.toString());
    }
    | MUL mulExpression addExpressionPart {
        $sb.append(" ").append($MUL.text).append(" ").append($mulExpression.sb.toString()).append($addExpressionPart.sb.toString());
    };

mulExpression
    returns [StringBuilder sb]
    @init {
        $sb = new StringBuilder();
    }
    : LPAR expression RPAR {
        $sb.append($LPAR.text).append($expression.sb.toString()).append($RPAR.text);
    }
    | integerOrVariableInRightPart {
        $sb.append($integerOrVariableInRightPart.sb.toString());
    };

boolValue
    returns [StringBuilder sb]
    @init {
        $sb = new StringBuilder();
    }
    : TRUE {
        $sb.append($TRUE.text);
    }
    | FALSE {
        $sb.append($FALSE.text);
    };

comparisonOp
     returns [StringBuilder sb]
     @init {
         $sb = new StringBuilder();
     }
     : op=(DEQ | NOT_EQ | LS | GT | LSEQ | GTEQ) {
        $sb.append($op.text);
     };

ifBlock
     returns [StringBuilder sb]
     @init {
         $sb = new StringBuilder();
     }
     : i=IF LPAR e1=expression comparisonOp e2=expression RPAR {
        $sb.append($i.text).append(" ").append($LPAR.text)
            .append($e1.sb.toString()).append(" ").append($comparisonOp.sb.toString()).append(" ").append($e2.sb.toString())
            .append($RPAR.text).append(" ");
     } LPF b=body RPF {
        $sb.append($LPF.text).append("\n").append($b.sb.toString()).append($RPF.text).append("\n");
     } (ELSE LPF bElse=body RPF {
        $sb.append($ELSE.text).append($LPF.text).append("\n").append($bElse.sb.toString()).append($RPF.text).append("\n");
     })?;

whileBlock
     returns [StringBuilder sb]
     @init {
         $sb = new StringBuilder();
     }
     : i=WHILE LPAR e1=expression comparisonOp e2=expression RPAR {
        $sb.append($i.text).append(" ").append($LPAR.text)
            .append($e1.sb.toString()).append(" ").append($comparisonOp.sb.toString()).append(" ").append($e2.sb.toString())
            .append($RPAR.text).append(" ");
     } LPF b=body RPF {
        $sb.append($LPF.text).append("\n").append($b.sb.toString()).append($RPF.text).append("\n");
     };

LPAR: '(';
RPAR: ')';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
USING: 'using';
NAMESPACE: 'namespace';
STD: 'std';
SEMICLONE: ';';
LONG: 'long';
LONGLONG: 'long long';
INT: 'int';
BOOL: 'bool';
RETURN: 'return';
EQ: '=';
DEQ: '==';
NOT_EQ: '!=';
LS: '<';
GT: '>';
LSEQ: '<=';
GTEQ: '>=';
CIN: 'cin';
COUT: 'cout';
DCOLON: '::';
DLEFT: '<<';
DRIGHT: '>>';
ENDL: 'endl';
TRUE: 'true';
FALSE: 'false';
INTEGER: (('-')?[1-9][0-9]* | '0');
PLUS: '+';
MUL: '*';
INCLUDE: '#include';
INCLUDE_NAME: '<' [a-zA-Z] [_\\.a-zA-Z]* '>';
MAIN: 'int main()';
LPF: '{';
RPF: '}';
VARIABLE_NAME: [a-zA-Z][a-zA-Z0-9_]*;
WS: [ \t\n]+ -> skip;