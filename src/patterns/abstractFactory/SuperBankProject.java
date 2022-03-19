package patterns.abstractFactory;

import patterns.abstractFactory.bankingProject.BankingTeamFactory;
import patterns.abstractFactory.general.ProjectTeamFactory;

public class SuperBankProject {
    public static void main(String[] args) {

        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();

        System.err.println("Start project...");
        projectTeamFactory.getDeveloper().writeCode();
        projectTeamFactory.getTester().testCode();
        projectTeamFactory.getPM().managing();
    }
}
