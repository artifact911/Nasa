package patterns.abstractFactory.abstractfactory.userpage;

import org.working3.abstractfactory.general.Footer;

public class UserFooter implements Footer {

    @Override
    public void fWork() {
        System.out.println("I'm UserFooter");
    }
}
