package tree_structure;

import java.util.ArrayList;
import java.util.List;

public class VarDeclOp extends Node{


    private ArrayList<IdentifierExpression> identifierExpressionList;
    private Type type;

    public VarDeclOp(ArrayList<IdentifierExpression> identifierExpressionList, Type type) {
        this.identifierExpressionList = identifierExpressionList;
        this.type = type;
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
