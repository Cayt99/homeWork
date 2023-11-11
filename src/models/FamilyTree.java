package models;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class FamilyTree implements Iterable<Human> {
    private List<Human> members = new ArrayList<>();

    public void addMember(Human member) {
        members.add(member);
    }

    @Override
    public Iterator<Human> iterator() {
        return members.iterator();
    }
}
