package patterns.abstractFactory.website;

import patterns.abstractFactory.general.ProjectManager;

public class WebSiteProjectManager implements ProjectManager {

    @Override
    public void managing() {
        System.out.println("WebSite PM managing website project...");
    }
}
