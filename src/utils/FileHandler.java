package io;

import models.FamilyTree;

import java.io.*;

public class FileHandler {

    public static <T> void saveFamilyTreeToFile(FamilyTree<T> familyTree, String filename) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(familyTree);
        }
    }

    public static <T> FamilyTree<T> loadFamilyTreeFromFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            return (FamilyTree<T>) in.readObject();
        }
    }
}
