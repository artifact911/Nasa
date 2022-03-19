package patterns.abstractFactory.general;

public interface ProjectTeamFactory {

    Developer getDeveloper();

    Tester getTester();

    ProjectManager getPM();
}
