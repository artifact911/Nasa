package patterns.abstractFactory.abstractfactory.userpage;

import org.working3.abstractfactory.general.NavBar;

public class UserNavBar implements NavBar {

    @Override
    public void nWork() {
        System.out.println("I'm UserNavBar");
    }
}
