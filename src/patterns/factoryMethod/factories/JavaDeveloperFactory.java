package patterns.factoryMethod.factories;

import patterns.factoryMethod.developers.Developer;
import patterns.factoryMethod.developers.JavaDeveloper;

public class JavaDeveloperFactory implements DevelopersFactory{

    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
