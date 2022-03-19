package patterns.abstractFactory.abstractfactory.adminpage;

import org.working3.abstractfactory.general.Footer;
import org.working3.abstractfactory.general.NavBar;
import org.working3.abstractfactory.general.PageFactory;
import org.working3.abstractfactory.general.Table;

public class AdminPageFactory implements PageFactory {

    @Override
    public NavBar getNavBar() {
        return new AdminNavBar();
    }

    @Override
    public Table getTable() {
        return new AdminTable();
    }

    @Override
    public Footer getFooter() {
        return new AdminFooter();
    }

}
