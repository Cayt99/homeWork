package FamilyTree;

import Human.Human;
import java.util.List;

public class FamilyTree {
    private Human root;

    public FamilyTree(Human root) {
        this.root = root;
    }

    public List<Human> findAllChildren(Human person) {
        return person.getChildren();
    }
}
