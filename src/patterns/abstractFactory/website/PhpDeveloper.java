package patterns.abstractFactory.website;

import patterns.abstractFactory.general.Developer;

public class PhpDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Php developer writing php code...");
    }
}
