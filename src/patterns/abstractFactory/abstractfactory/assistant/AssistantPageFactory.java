package patterns.abstractFactory.abstractfactory.assistant;

import patterns.abstractFactory.abstractfactory.general.Footer;
import patterns.abstractFactory.abstractfactory.general.NavBar;
import patterns.abstractFactory.abstractfactory.general.PageFactory;
import patterns.abstractFactory.abstractfactory.general.Table;

public class AssistantPageFactory implements PageFactory {

    @Override
    public NavBar getNavBar() {
        return new AssistantNavBar();
    }

    @Override
    public Table getTable() {
        return new AssistantTable();
    }

    @Override
    public Footer getFooter() {
        return new AssistantFooter();
    }
}
