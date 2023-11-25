package main;

import models.FamilyTree;
import models.Human;
import models.Gender;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FamilyTree familyTree = new FamilyTree();

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1 - Добавить члена семьи");
            System.out.println("2 - Вывести семейное древо");
            System.out.println("0 - Выйти");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addFamilyMember(scanner, familyTree);
                    break;
                case "2":
                    printFamilyTree(familyTree);
                    break;
                case "0":
                    System.out.println("Завершение работы...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте еще раз.");
            }
        }
    }

    private static void addFamilyMember(Scanner scanner, FamilyTree familyTree) {
        System.out.println("Введите имя:");
        String name = scanner.nextLine();

        System.out.println("Введите пол (MALE или FEMALE):");
        Gender gender = Gender.valueOf(scanner.nextLine().toUpperCase());

        System.out.println("Введите дату рождения (ГГГГ-ММ-ДД):");
        String birthDate = scanner.nextLine();

        // Здесь можно добавить логику для ввода родителей, если требуется

        Human newMember = new Human(name, gender, birthDate, null, null);
        familyTree.addMember(newMember);
        System.out.println("Член семьи " + name + " успешно добавлен.");
    }

    private static void printFamilyTree(FamilyTree familyTree) {
        System.out.println("Семейное древо:");
        for (Human member : familyTree.getMembers()) {
            System.out.println(member);
        }
    }
}
