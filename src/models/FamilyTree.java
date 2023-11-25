package models;

import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree implements Serializable {
    private List<Human> members;  // Используем Human напрямую без обобщений

    public FamilyTree() {
        this.members = new ArrayList<>();
    }

    public void addMember(Human member) {
        members.add(member);
    }

    public List<Human> getMembers() {
        return new ArrayList<>(members);  // Возвращаем копию списка для безопасности
    }

    public Human findMemberByName(String name) {
        for (Human member : members) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    public List<Human> getAncestors(Human person) {
        List<Human> ancestors = new ArrayList<>();
        if (person.getMother() != null) {
            ancestors.add(person.getMother());
            ancestors.addAll(getAncestors(person.getMother()));
        }
        if (person.getFather() != null) {
            ancestors.add(person.getFather());
            ancestors.addAll(getAncestors(person.getFather()));
        }
        return ancestors;
    }

    public List<Human> getDescendants(Human person) {
        List<Human> descendants = new ArrayList<>();
        descendants.addAll(person.getChildren());
        for (Human child : person.getChildren()) {
            descendants.addAll(getDescendants(child));
        }
        return descendants;
    }

    // Методы для сериализации и десериализации списка членов семьи
    public void saveToFile(String filename) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(members);
        }
    }

    public void loadFromFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            members = (List<Human>) in.readObject();
        }
    }
}
