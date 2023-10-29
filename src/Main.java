import Human.Gender;
import Human.Human;
import FamilyTree.FamilyTree;

public class Main {
    public static void main(String[] args) {
        Human grandfather = new Human("John", Gender.MALE, null, null);
        Human grandmother = new Human("Jane", Gender.FEMALE, null, null);
        Human father = new Human("Mike", Gender.MALE, grandfather, grandmother);
        Human mother = new Human("Anna", Gender.FEMALE, null, null);
        Human child1 = new Human("Tom", Gender.MALE, father, mother);
        Human child2 = new Human("Lucy", Gender.FEMALE, father, mother);

        father.addChild(child1);
        father.addChild(child2);

        FamilyTree familyTree = new FamilyTree(grandfather);
        for (Human child : familyTree.findAllChildren(father)) {
            System.out.println(child.getName());
        }
    }
}
