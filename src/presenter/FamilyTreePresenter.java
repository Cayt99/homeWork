package presenter;

import models.FamilyTree;
import models.Human;
import view.FamilyTreeView;

public class FamilyTreePresenter {
    private FamilyTree model;
    private FamilyTreeView view;

    public FamilyTreePresenter(FamilyTree model, FamilyTreeView view) {
        this.model = model;
        this.view = view;
        view.setPresenter(this);
    }

    public void addFamilyMember(Human member) {
        model.addMember(member);
        view.updateFamilyTreeDisplay(model);
    }

    public void findMemberAndDisplay(String name) {
        Human member = model.findMemberByName(name);
        if (member != null) {
            view.displayMemberInfo(member);
        } else {
            view.displayMessage("Член семьи не найден.");
        }
    }

    // Другие методы...
}
