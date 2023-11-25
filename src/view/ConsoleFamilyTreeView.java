package view;

import presenter.FamilyTreePresenter;
import models.FamilyTree;
import models.Human;

import java.util.Scanner;

public class ConsoleFamilyTreeView implements FamilyTreeView {
    private FamilyTreePresenter presenter;
    private Scanner scanner;

    public ConsoleFamilyTreeView() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void setPresenter(FamilyTreePresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void updateFamilyTreeDisplay(FamilyTree familyTree) {  // Удалены угловые скобки с параметром типа
        for (Human member : familyTree.getMembers()) {
            System.out.println(member);
        }
    }

    public void displayMemberInfo(Human member) {
        System.out.println("Найденный член семьи: " + member);
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

 
}
