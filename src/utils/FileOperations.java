package utils;

import models.FamilyTree;

public interface FileOperations {
    void writeToFile(FamilyTree familyTree, String filename);
    FamilyTree readFromFile(String filename);
}