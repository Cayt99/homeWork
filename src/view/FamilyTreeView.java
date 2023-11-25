package view;

import models.Human;
import presenter.FamilyTreePresenter;
import models.FamilyTree;

public interface FamilyTreeView {
    void setPresenter(FamilyTreePresenter presenter);
    void updateFamilyTreeDisplay(FamilyTree familyTree); // Убраны угловые скобки с wildcard типом
    void displayMemberInfo(Human member);
    void displayMessage(String message);
}
