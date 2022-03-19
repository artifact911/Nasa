package patterns.abstractFactory.abstractfactory.adminpage;

import org.working3.abstractfactory.general.Table;

public class AdminTable implements Table {

    @Override
    public void tWork() {
        System.out.println("I'm AdminTable");
    }
}
