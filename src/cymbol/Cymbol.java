/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package cymbol;

import java.io.FileInputStream;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author GUERINOI
 */
public class Cymbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        if (args.length == 1) {
            try {
                // parsing
                // create file input stream
                FileInputStream source = new FileInputStream(args[0]);
                // create a CharStream that reads from standard input
                ANTLRInputStream input = new ANTLRInputStream(source);
                // create a lexer that feeds off of input CharStream
                CymbolLexer lexer = new CymbolLexer(input);
                // create a buffer of tokens pulled from the lexer
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                // create a parser that feeds off the tokens buffer
                CymbolParser parser = new CymbolParser(tokens);
                ParseTree tree = parser.file(); // begin parsing at init rule
                
                // dump ast
                System.out.println(tree.toStringTree(parser)); // print LISP-style tree
                
                // build call graph
                ParseTreeWalker walker = new ParseTreeWalker();
                FunctionListener collector = new FunctionListener();
                walker.walk(collector, tree);
                System.out.println(collector.graph.toString());
                System.out.println(collector.graph.toDOT());
                
            } catch (IOException e) {
                System.out.print("error: " + e.getMessage());
            }
        }
        else {
            System.out.print("error: syntax is Cymbol <file path> !");
        }
    }
    
}
