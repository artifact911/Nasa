package patterns.abstractFactory.abstractfactory.assistant;

import org.working3.abstractfactory.general.Footer;
import org.working3.abstractfactory.general.NavBar;
import org.working3.abstractfactory.general.PageFactory;
import org.working3.abstractfactory.general.Table;

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
