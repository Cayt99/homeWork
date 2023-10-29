package interfaces;

import Human.Human;
import java.util.List;

public interface FileOperations {
    void writeToFile(List<Human> family, String filename);
    List<Human> readFromFile(String filename);
}
