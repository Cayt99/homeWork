import java.util.ArrayList;

public class FamilyTree {
    private Person root;

    public FamilyTree(Person root) {
        this.root = root;
    }
    public void addPerson(Person person, Person parent) {
        if (parent == null) {
            this.root = person;
        } else {
            parent.addChild(person);
        }
    }
    public ArrayList<Person> findAllChildren(String name) {
        return new ArrayList<>();  // Заглушка
    }


}
