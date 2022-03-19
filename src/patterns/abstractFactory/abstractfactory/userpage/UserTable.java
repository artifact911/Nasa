package patterns.abstractFactory.abstractfactory.userpage;

import org.working3.abstractfactory.general.Table;

public class UserTable implements Table {

    @Override
    public void tWork() {
        System.out.println("I'm UserTable");
    }
}
