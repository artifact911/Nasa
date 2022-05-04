package patterns.abstractFactory.abstractfactory.adminpage;


import patterns.abstractFactory.abstractfactory.general.Footer;
import patterns.abstractFactory.abstractfactory.general.NavBar;
import patterns.abstractFactory.abstractfactory.general.PageFactory;
import patterns.abstractFactory.abstractfactory.general.Table;

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
