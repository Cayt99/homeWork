package utils;

import models.Human;
import interfaces.FileOperations;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler implements FileOperations {

    @Override
    public void writeToFile(List<Human> family, String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(family);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Human> readFromFile(String filename) {
        List<Human> family = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            family = (List<Human>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return family;
    }
}
