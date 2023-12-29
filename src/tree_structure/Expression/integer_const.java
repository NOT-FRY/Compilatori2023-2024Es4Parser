package tree_structure.Expression;

import tree_structure.Node;
import tree_structure.Visitor;

public class integer_const extends Node implements Expression {
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
