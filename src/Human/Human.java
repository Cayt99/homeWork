package Human;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Human implements Serializable {
    private String name;
    private Gender gender;
    private Human father;
    private Human mother;
    private List<Human> children;

    public Human(String name, Gender gender, Human father, Human mother) {
        this.name = name;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addChild(Human child) {
        this.children.add(child);
    }

    public List<Human> getChildren() {
        return children;
    }

    // другие геттеры и сеттеры, если они у вас есть
}
