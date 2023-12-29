package tree_structure.Statement;

import tree_structure.Visitor;

public interface Statement {
    Object accept(Visitor v);
}

