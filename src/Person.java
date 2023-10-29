import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Person> children;

    public Person(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Person> getChildren() {
        return children;
    }
    // В класс Person
    public void addChild(Person child) {
        this.children.add(child);
    }

}
