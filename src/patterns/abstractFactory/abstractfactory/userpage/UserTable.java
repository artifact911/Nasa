package patterns.abstractFactory.abstractfactory.userpage;

import patterns.abstractFactory.abstractfactory.general.Table;

public class UserTable implements Table {

    @Override
    public void tWork() {
        System.out.println("I'm UserTable");
    }
}
