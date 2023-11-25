package io;

import models.FamilyTree;
import models.Human;

import java.io.*;

public class FileHandler {

    public static void saveFamilyTreeToFile(FamilyTree familyTree, String filename) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(familyTree);
        }
    }

    public static FamilyTree loadFamilyTreeFromFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            return (FamilyTree) in.readObject();
        }
    }
}
