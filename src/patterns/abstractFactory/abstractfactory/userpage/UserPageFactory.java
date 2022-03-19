package patterns.abstractFactory.abstractfactory.userpage;

import org.working3.abstractfactory.general.Footer;
import org.working3.abstractfactory.general.NavBar;
import org.working3.abstractfactory.general.PageFactory;
import org.working3.abstractfactory.general.Table;

public class UserPageFactory implements PageFactory {

    @Override
    public NavBar getNavBar() {
        return new UserNavBar();
    }

    @Override
    public Table getTable() {
        return new UserTable();
    }

    @Override
    public Footer getFooter() {
        return new UserFooter();
    }
}
