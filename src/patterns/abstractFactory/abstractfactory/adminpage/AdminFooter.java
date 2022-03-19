package patterns.abstractFactory.abstractfactory.adminpage;

import org.working3.abstractfactory.general.Footer;

public class AdminFooter implements Footer {

    @Override
    public void fWork() {
        System.out.println("I'm AdminFooter");
    }
}
