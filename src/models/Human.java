package models;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

public class Human implements Serializable {
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

    // Геттеры и сеттеры

    public void addChild(Human child) {
        this.children.add(child);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Пол: " + (gender == Gender.MALE ? "Мужской" : "Женский") + ", Дата рождения: " + birthDate;
    }


}
