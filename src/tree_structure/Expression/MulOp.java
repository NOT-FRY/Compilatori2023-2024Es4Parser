package tree_structure.Expression;

import tree_structure.Node;
import tree_structure.Visitor;

import java.util.Objects;

public class MulOp extends Node implements Expression {
    private Expression left;
    private Expression right;

    public MulOp(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "MulOp{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MulOp mulOp)) return false;
        return Objects.equals(getLeft(), mulOp.getLeft()) && Objects.equals(getRight(), mulOp.getRight());
    }


    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    @Override
    public Object accept(Visitor v){
        return v.visit(this);
    }
}