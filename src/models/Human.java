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

    public Human(String name, Gender gender, String birthDate) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    // Геттеры
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
        return new ArrayList<>(children); // Возвращает копию списка детей
    }

    // Сеттеры для установки родителей и добавления в их список детей
    public void setMother(Human mother) {
        this.mother = mother;
        if (mother != null) {
            mother.addChild(this);
        }
    }

    public void setFather(Human father) {
        this.father = father;
        if (father != null) {
            father.addChild(this);
        }
    }

    public void addChild(Human child) {
        if (child != null && !this.children.contains(child)) {
            this.children.add(child);
        }
    }

    // Переопределение метода toString для вывода информации о человеке
    @Override
    public String toString() {
        String info = "Имя: " + name + ", Пол: " + gender + ", Дата рождения: " + birthDate;
        if (mother != null) {
            info += ", Мать: " + mother.getName();
        }
        if (father != null) {
            info += ", Отец: " + father.getName();
        }
        // Можно добавить вывод информации о детях, если это необходимо
        return info;
    }
}
