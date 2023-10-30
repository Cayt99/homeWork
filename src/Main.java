import models.Gender;
import models.Human;
import controllers.FamilyTree;

public class Main {
    public static void main(String[] args) {

        Human grandfather = new Human("John", Gender.MALE, "01/01/1940", null, null);
        Human grandmother = new Human("Jane", Gender.FEMALE, "01/02/1941", null, null);
        Human father = new Human("Mike", Gender.MALE, "01/01/1970", grandfather, grandmother);
        Human mother = new Human("Anna", Gender.FEMALE, "01/02/1971", null, null);
        Human child1 = new Human("Tom", Gender.MALE, "01/01/2000", father, mother);
        Human child2 = new Human("Lucy", Gender.FEMALE, "01/02/2002", father, mother);


        father.addChild(child1);
        father.addChild(child2);


        FamilyTree familyTree = new FamilyTree();
        familyTree.addMember(grandfather);
        familyTree.addMember(grandmother);
        familyTree.addMember(father);
        familyTree.addMember(mother);
        familyTree.addMember(child1);
        familyTree.addMember(child2);


        for (Human human : familyTree) {
            System.out.println(human.getName());
        }
    }
}
