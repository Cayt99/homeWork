package interfaces;

import models.Human;
import java.util.List;

public interface FamilyTreeOperations {
    List<Human> findAllChildren(Human parent);

}
