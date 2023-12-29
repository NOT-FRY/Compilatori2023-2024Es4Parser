package tree_structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VarDeclOp extends Node{


    private ArrayList<IdentifierExpression> identifierExpressionList;
    private Type type;

    public VarDeclOp(ArrayList<IdentifierExpression> identifierExpressionList, Type type) {
        this.identifierExpressionList = identifierExpressionList;
        this.type = type;
    }

    @Override
    public String toString() {
        return "VarDeclOp{" +
                "identifierExpressionList=" + identifierExpressionList +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VarDeclOp varDeclOp)) return false;
        return Objects.equals(getIdentifierExpressionList(), varDeclOp.getIdentifierExpressionList()) && getType() == varDeclOp.getType();
    }


    public ArrayList<IdentifierExpression> getIdentifierExpressionList() {
        return identifierExpressionList;
    }

    public void setIdentifierExpressionList(ArrayList<IdentifierExpression> identifierExpressionList) {
        this.identifierExpressionList = identifierExpressionList;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Object accept(Visitor v){
        return v.visit(this);
    }
}
