package patterns.abstractFactory.website;

import patterns.abstractFactory.general.Developer;
import patterns.abstractFactory.general.ProjectManager;
import patterns.abstractFactory.general.ProjectTeamFactory;
import patterns.abstractFactory.general.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATesterWebSite();
    }

    @Override
    public ProjectManager getPM() {
        return new WebSiteProjectManager();
    }
}
