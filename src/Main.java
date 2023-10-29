public class Main {
    public static void main(String[] args) {
        Person adam = new Person("Adam");
        FamilyTree tree = new FamilyTree(adam);

        Person eve = new Person("Eve");
        tree.addPerson(eve, adam);

        // Тестирование
    }

}
