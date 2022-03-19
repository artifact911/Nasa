package patterns.abstractFactory;

import patterns.abstractFactory.general.ProjectTeamFactory;
import patterns.abstractFactory.website.WebsiteTeamFactory;

public class SiteProject {
    public static void main(String[] args) {

        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();

        System.err.println("Start project...");
        projectTeamFactory.getDeveloper().writeCode();
        projectTeamFactory.getTester().testCode();
        projectTeamFactory.getPM().managing();

    }
}
