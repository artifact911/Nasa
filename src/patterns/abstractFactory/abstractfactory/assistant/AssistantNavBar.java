package patterns.abstractFactory.abstractfactory.assistant;

import org.working3.abstractfactory.general.NavBar;

public class AssistantNavBar implements NavBar {

    @Override
    public void nWork() {
        System.out.println("I'm assistant NavBar");
    }
}
