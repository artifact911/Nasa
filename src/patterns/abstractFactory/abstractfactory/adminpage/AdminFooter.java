package patterns.abstractFactory.abstractfactory.adminpage;

import patterns.abstractFactory.abstractfactory.general.Footer;

public class AdminFooter implements Footer {

    @Override
    public void fWork() {
        System.out.println("I'm AdminFooter");
    }
}
