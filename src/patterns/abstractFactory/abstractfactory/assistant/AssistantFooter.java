package patterns.abstractFactory.abstractfactory.assistant;

import patterns.abstractFactory.abstractfactory.general.Footer;

public class AssistantFooter implements Footer {

    @Override
    public void fWork() {
        System.out.println("I'm assistant footer");
    }
}
