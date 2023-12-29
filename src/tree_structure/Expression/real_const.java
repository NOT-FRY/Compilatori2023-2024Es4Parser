package tree_structure.Expression;

import tree_structure.Node;
import tree_structure.Visitor;

public class real_const extends Node implements Expression {
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

