package patterns.abstractFactory.abstractfactory.assistant;

import patterns.abstractFactory.abstractfactory.general.NavBar;

public class AssistantNavBar implements NavBar {

    @Override
    public void nWork() {
        System.out.println("I'm assistant NavBar");
    }
}
