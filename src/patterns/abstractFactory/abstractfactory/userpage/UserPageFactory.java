package patterns.abstractFactory.abstractfactory.userpage;


import patterns.abstractFactory.abstractfactory.general.Footer;
import patterns.abstractFactory.abstractfactory.general.NavBar;
import patterns.abstractFactory.abstractfactory.general.PageFactory;
import patterns.abstractFactory.abstractfactory.general.Table;

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
