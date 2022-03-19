package patterns.abstractFactory.bankingProject;

import patterns.abstractFactory.general.ProjectManager;

public class BankingProjectManager implements ProjectManager {

    @Override
    public void managing() {
        System.out.println("PM managing banking project...");
    }
}
