package patterns.abstractFactory.abstractfactory.assistant;

import org.working3.abstractfactory.general.Table;

public class AssistantTable implements Table {

    @Override
    public void tWork() {
        System.out.println("I'm Assistant Table");
    }
}
