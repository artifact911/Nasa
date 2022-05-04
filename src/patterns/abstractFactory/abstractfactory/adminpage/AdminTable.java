package patterns.abstractFactory.abstractfactory.adminpage;


import patterns.abstractFactory.abstractfactory.general.Table;

public class AdminTable implements Table {

    @Override
    public void tWork() {
        System.out.println("I'm AdminTable");
    }
}
