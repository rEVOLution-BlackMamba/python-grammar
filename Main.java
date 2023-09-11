import java.io.File;
import java.io.FileReader;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File(args[0]);
        FileReader reader = new FileReader(file);
        ANTLRInputStream input = new ANTLRInputStream(reader);
        PythonLexer lexer = new PythonLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PythonParser parser = new PythonParser(tokens);
        ParseTree tree = parser.program();
        MyPythonVisitor interpVisitor = new MyPythonVisitor();
        interpVisitor.visit(tree);
        System.exit(0);
    }
    
}
