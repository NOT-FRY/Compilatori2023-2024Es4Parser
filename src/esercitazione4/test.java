package esercitazione4;

import java_cup.runtime.Symbol;
import tree_structure.PrintXMLTreeVisitor;
import tree_structure.ProgramOp;

import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileReader;

public class test {
    public static void main(String[] args) throws Exception{
        File file = new File("test\\test1.txt");
        BufferedReader br= new BufferedReader(new FileReader(file));
        parser p = new parser(new Yylex(br));

        ProgramOp program = (ProgramOp)p.debug_parse().value;

        PrintXMLTreeVisitor visitor = new PrintXMLTreeVisitor("xmloutput\\test1.txt");
        visitor.visit(program);

    }
}
