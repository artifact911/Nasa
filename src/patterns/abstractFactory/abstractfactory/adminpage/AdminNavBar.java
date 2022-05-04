package patterns.abstractFactory.abstractfactory.adminpage;


import patterns.abstractFactory.abstractfactory.general.NavBar;

public class AdminNavBar implements NavBar {

    @Override
    public void nWork() {
        System.out.println("I'm AdminNavBar");
    }
}
