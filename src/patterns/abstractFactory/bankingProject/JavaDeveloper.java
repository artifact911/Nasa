package patterns.abstractFactory.bankingProject;

import patterns.abstractFactory.general.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("JavaDeveloper writing java code...");
    }
}
