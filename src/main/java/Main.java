import antlr.HelloLexer;
import antlr.HelloParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*try {*/
            HelloLexer lexerFst = new HelloLexer(CharStreams.fromString("#include <iostream>\n" +
                    "#include<string>\n" +
                    "int main() {\n" +
                    "int a = 7;\n" +
                    "int b = 8;\n" +
                    "int c = 13;\n" +
                    "int a = 7;\n" +
                    "int b = 8;\n" +
                    "int c = 13;\n" +
                    "int d = 42;\n" +
                    "}"));
            HelloParser parserFst = new HelloParser(new CommonTokenStream(lexerFst));
            parserFst.start();
        /*} catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
