package tree_structure.Expression;

import tree_structure.Visitor;

public interface Expression {
    Object accept(Visitor v);
}
