import antlr.HelloLexer;
import antlr.HelloParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*try {*/
            HelloLexer lexerFst = new HelloLexer(CharStreams.fromString("long a = 45;\nlong a = 19;\nlong x = 95;\nlong c = 95;\nlong t = 95;"));
            HelloParser parserFst = new HelloParser(new CommonTokenStream(lexerFst));
            parserFst.start();
        /*} catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
