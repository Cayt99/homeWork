package controllers;

import models.Human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class FamilyTree implements Iterable<Human> {
    private List<Human> members = new ArrayList<>();

    @Override
    public Iterator<Human> iterator() {
        return members.iterator();
    }

    public void addMember(Human human) {
        members.add(human);
    }

    public List<Human> getMembers() {
        return members;
    }

    public List<Human> findAllChildren(Human parent) {
        List<Human> children = new ArrayList<>();
        for (Human member : members) {
            if (member.getChildren().contains(parent)) {
                children.add(member);
            }
        }
        return children;
    }

    public int getFamilySize() {
        return members.size();
    }

    public void sortByName() {
        Collections.sort(members, Comparator.comparing(Human::getName));
    }

    public void sortByDateOfBirth() {
        Collections.sort(members, Comparator.comparing(Human::getDateOfBirth));
    }
}
