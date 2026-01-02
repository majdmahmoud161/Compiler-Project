import AST.Program;
import antlr.PythonLexer;
import antlr.PythonParser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import Visitor.BaseVisitor;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Main {
    public static void main(String[] args) throws  IOException {
        String source = "test/test.txt";
        CharStream charStream = fromFileName(source);
        PythonLexer lexer = new PythonLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PythonParser parser = new PythonParser(tokens);
        ParseTree ast = parser.program();
        BaseVisitor baseVisitor = new BaseVisitor();
        Program program = (Program) baseVisitor.visit(ast);

        System.out.println(program);
    }
}