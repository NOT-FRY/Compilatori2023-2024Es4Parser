package tree_structure;

import java.util.Objects;

public interface Expression {
    Object accept(Visitor v);
}

class AddOp extends Node implements Expression {
    private Expression left;
    private Expression right;

    public AddOp(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "AddOp{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AddOp addOp)) return false;
        return Objects.equals(getLeft(), addOp.getLeft()) && Objects.equals(getRight(), addOp.getRight());
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

class MulOp extends Node implements Expression {
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

class DiffOp extends Node implements Expression {
    private Expression left;
    private Expression right;

    public DiffOp(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "DiffOp{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DiffOp diffOp)) return false;
        return Objects.equals(getLeft(), diffOp.getLeft()) && Objects.equals(getRight(), diffOp.getRight());
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

class DivOp extends Node implements Expression {
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

class AndOp extends Node implements Expression {
    private Expression left;
    private Expression right;

    public AndOp(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "AndOp{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AndOp andOp)) return false;
        return Objects.equals(getLeft(), andOp.getLeft()) && Objects.equals(getRight(), andOp.getRight());
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

class OrOp extends Node implements Expression {
    private Expression left;
    private Expression right;

    public OrOp(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "OrOp{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrOp orOp)) return false;
        return Objects.equals(getLeft(), orOp.getLeft()) && Objects.equals(getRight(), orOp.getRight());
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

class GTOp extends Node implements Expression {
    private Expression left;
    private Expression right;

    public GTOp(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "GTOp{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GTOp gtOp)) return false;
        return Objects.equals(getLeft(), gtOp.getLeft()) && Objects.equals(getRight(), gtOp.getRight());
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

class GEOp extends Node implements Expression {
    private Expression left;
    private Expression right;

    public GEOp(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "GEOp{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GEOp geOp)) return false;
        return Objects.equals(getLeft(), geOp.getLeft()) && Objects.equals(getRight(), geOp.getRight());
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

class LTOp extends Node implements Expression {
    private Expression left;
    private Expression right;

    public LTOp(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "LTOp{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LTOp ltOp)) return false;
        return Objects.equals(getLeft(), ltOp.getLeft()) && Objects.equals(getRight(), ltOp.getRight());
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

class LEOp extends Node implements Expression {
    private Expression left;
    private Expression right;

    public LEOp(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "LEOp{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LEOp leOp)) return false;
        return Objects.equals(getLeft(), leOp.getLeft()) && Objects.equals(getRight(), leOp.getRight());
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

class EQOp extends Node implements Expression {
    private Expression left;
    private Expression right;

    public EQOp(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "EQOp{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EQOp eqOp)) return false;
        return Objects.equals(getLeft(), eqOp.getLeft()) && Objects.equals(getRight(), eqOp.getRight());
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

class NEOp extends Node implements Expression {
    private Expression left;
    private Expression right;

    public NEOp(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "NEOp{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NEOp neOp)) return false;
        return Objects.equals(getLeft(), neOp.getLeft()) && Objects.equals(getRight(), neOp.getRight());
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

class UminusOp extends Node implements Expression {
    private Expression value;

    @Override
    public String toString() {
        return "UminusOp{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UminusOp uminusOp)) return false;
        return Objects.equals(getValue(), uminusOp.getValue());
    }

    public UminusOp(Expression value) {
        this.value = value;
    }

    public Expression getValue() {
        return value;
    }

    public void setValue(Expression value) {
        this.value = value;
    }

    @Override
    public Object accept(Visitor v){
        return v.visit(this);
    }
}

class NotOp extends Node implements Expression {
    private Expression value;

    @Override
    public String toString() {
        return "NotOp{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NotOp notOp)) return false;
        return Objects.equals(getValue(), notOp.getValue());
    }

    public NotOp(Expression value) {
        this.value = value;
    }

    public Expression getValue() {
        return value;
    }

    public void setValue(Expression value) {
        this.value = value;
    }

    @Override
    public Object accept(Visitor v){
        return v.visit(this);
    }
}

class integer_const extends Node implements Expression {
    private int value;

    @Override
    public String toString() {
        return "integer_const{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof integer_const that)) return false;
        return getValue() == that.getValue();
    }



    public integer_const(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public Object accept(Visitor v){
        return v.visit(this);
    }
}

class real_const extends Node implements Expression {
    private int value;

    @Override
    public String toString() {
        return "real_const{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof real_const realConst)) return false;
        return getValue() == realConst.getValue();
    }


    public real_const(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public Object accept(Visitor v){
        return v.visit(this);
    }
}

class string_const extends Node implements Expression {
    private String value;

    @Override
    public String toString() {
        return "string_const{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof string_const that)) return false;
        return Objects.equals(getValue(), that.getValue());
    }


    public string_const(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public Object accept(Visitor v){
        return v.visit(this);
    }
}

class  true_const extends Node implements Expression {
    private boolean value;

    @Override
    public String toString() {
        return "true_const{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof true_const trueConst)) return false;
        return getValue() == trueConst.getValue();
    }

    public  true_const() {
        this.value = true;
    }

    public boolean getValue() {
        return value;
    }


    @Override
    public Object accept(Visitor v){
        return v.visit(this);
    }
}

class  false_const extends Node implements Expression {
    private boolean value;

    @Override
    public String toString() {
        return "false_const{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof false_const that)) return false;
        return getValue() == that.getValue();
    }


    public  false_const() {
        this.value = false;
    }

    public boolean getValue() {
        return value;
    }


    @Override
    public Object accept(Visitor v){
        return v.visit(this);
    }
}

