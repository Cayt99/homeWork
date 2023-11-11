package models;

import java.util.List;
import java.util.ArrayList;

public class Human {
    private String name;
    private Gender gender;
    private String birthDate;
    private Human mother;
    private Human father;
    private List<Human> children;

    public Human(String name, Gender gender, String birthDate, Human father, Human mother) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.father = father;
        this.mother = mother;
        this.children = new ArrayList<>();
    }

    // Getters and setters

    public void addChild(Human child) {
        this.children.add(child);
    }

    public String getName() {
        return this.name;
    }

    // Other methods
}
