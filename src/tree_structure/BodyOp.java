package tree_structure;

import java.util.ArrayList;
import java.util.Objects;

public class BodyOp extends Node{
    private ArrayList<VarDeclOp> varDeclList;
    private ArrayList<Statement> statementList;

    public BodyOp(ArrayList<VarDeclOp> varDeclList, ArrayList<Statement> statementList) {
        this.varDeclList = varDeclList;
        this.statementList = statementList;
    }

    @Override
    public String toString() {
        return "BodyOp{" +
                "varDeclList=" + varDeclList +
                ", statementList=" + statementList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BodyOp bodyOp = (BodyOp) o;
        return Objects.equals(varDeclList, bodyOp.varDeclList) && Objects.equals(statementList, bodyOp.statementList);
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
