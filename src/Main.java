import models.Gender;
import models.Human;
import models.FamilyTree;
import io.FileHandler;

public class Main {
    public static void main(String[] args) {
        // Создаем членов семьи
        Human grandfather = new Human("Джон", Gender.MALE, "01/01/1940", null, null);
        Human grandmother = new Human("Джейн", Gender.FEMALE, "01/02/1941", null, null);
        Human father = new Human("Майк", Gender.MALE, "01/01/1970", grandfather, grandmother);
        Human mother = new Human("Анна", Gender.FEMALE, "01/02/1971", null, null);
        Human child1 = new Human("Том", Gender.MALE, "01/01/2000", father, mother);
        Human child2 = new Human("Люси", Gender.FEMALE, "01/02/2002", father, mother);

        // Инициализируем семейное древо
        FamilyTree<Human> familyTree = new FamilyTree<>();
        familyTree.addMember(grandfather);
        familyTree.addMember(grandmother);
        familyTree.addMember(father);
        familyTree.addMember(mother);
        familyTree.addMember(child1);
        familyTree.addMember(child2);

        try {
            // Сохраняем семейное древо в файл
            FileHandler.saveFamilyTreeToFile(familyTree, "familyTree.ser");
            System.out.println("Семейное древо успешно сохранено в файл.");

            // Загружаем семейное древо из файла
            FamilyTree<Human> loadedFamilyTree = FileHandler.loadFamilyTreeFromFile("familyTree.ser");
            System.out.println("Семейное древо успешно загружено из файла.");

            // Выводим информацию о членах семьи
            for (Human human : loadedFamilyTree) {
                System.out.println(human);
            }
        } catch (Exception e) { // Ловим все исключения для упрощения
            e.printStackTrace();
        }
    }
}
