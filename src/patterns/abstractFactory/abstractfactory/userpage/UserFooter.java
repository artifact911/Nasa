package patterns.abstractFactory.abstractfactory.userpage;


import patterns.abstractFactory.abstractfactory.general.Footer;

public class UserFooter implements Footer {

    @Override
    public void fWork() {
        System.out.println("I'm UserFooter");
    }
}
