package tree_structure;

import java.util.ArrayList;

public class BodyOp extends Node{
    private ArrayList<VarDeclOp> varDeclList;
    private ArrayList<Statement> statementList;

    public BodyOp(ArrayList<VarDeclOp> varDeclList, ArrayList<Statement> statementList) {
        this.varDeclList = varDeclList;
        this.statementList = statementList;
    }

    public ArrayList<VarDeclOp> getVarDeclList() {
        return varDeclList;
    }

    public void setVarDeclList(ArrayList<VarDeclOp> varDeclList) {
        this.varDeclList = varDeclList;
    }

    public ArrayList<Statement> getStatementList() {
        return statementList;
    }

    public void setStatementList(ArrayList<Statement> statementList) {
        this.statementList = statementList;
    }

    public Object accept(Visitor v){
        return v.visit(this);
    }
}
