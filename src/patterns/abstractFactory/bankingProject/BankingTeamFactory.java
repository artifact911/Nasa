package patterns.abstractFactory.bankingProject;

import patterns.abstractFactory.general.Developer;
import patterns.abstractFactory.general.ProjectManager;
import patterns.abstractFactory.general.ProjectTeamFactory;
import patterns.abstractFactory.general.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getPM() {
        return new BankingProjectManager();
    }
}
