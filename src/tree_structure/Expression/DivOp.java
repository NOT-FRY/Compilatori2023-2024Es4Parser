package tree_structure.Expression;

import tree_structure.Node;
import tree_structure.Visitor;

import java.util.Objects;

public class DivOp extends Node implements Expression {
    private Expression left;
    private Expression right;

    public DivOp(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "DivOp{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DivOp divOp)) return false;
        return Objects.equals(getLeft(), divOp.getLeft()) && Objects.equals(getRight(), divOp.getRight());
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
