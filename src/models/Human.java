package models;

import java.util.ArrayList;
import java.util.List;

public class Human {
    private String name;
    private Gender gender;
    private String birthDate;
    private Human mother;
    private Human father;
    private List<Human> children = new ArrayList<>();


    public Human(String name, Gender gender, String birthDate, Human mother, Human father) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.mother = mother;
        this.father = father;

        if (mother != null) {
            mother.addChild(this);
        }
        if (father != null) {
            father.addChild(this);
        }
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public List<Human> getChildren() {
        return new ArrayList<>(children);
    }

    public void addChild(Human child) {
        if (child != null) {
            this.children.add(child);
        }
    }

    @Override
    public String toString() {
        String info = "Имя: " + name + ", Пол: " + gender + ", Дата рождения: " + birthDate;
        if (mother != null) {
            info += ", Мать: " + mother.getName();
        }
        if (father != null) {
            info += ", Отец: " + father.getName();
        }

        return info;
    }

}
