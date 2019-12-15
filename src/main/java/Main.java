import antlr.HelloLexer;
import antlr.HelloParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            //HelloLexer lexerFst = new HelloLexer(CharStreams.fromFileName("/home/polinb/IdeaProjects/Test/src/test/test1.cpp"));
            //HelloLexer lexerFst = new HelloLexer(CharStreams.fromFileName("/home/polinb/IdeaProjects/Test/src/test/test2.cpp"));
            //HelloLexer lexerFst = new HelloLexer(CharStreams.fromFileName("/home/polinb/IdeaProjects/Test/src/test/test3.cpp"));
            //HelloLexer lexerFst = new HelloLexer(CharStreams.fromFileName("/home/polinb/IdeaProjects/Test/src/test/test4.cpp"));
            HelloLexer lexerFst = new HelloLexer(CharStreams.fromFileName("/home/polinb/IdeaProjects/Test/src/test/test5.cpp"));
            HelloParser parserFst = new HelloParser(new CommonTokenStream(lexerFst));
            parserFst.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
