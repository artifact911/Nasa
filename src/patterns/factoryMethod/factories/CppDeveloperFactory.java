package patterns.factoryMethod.factories;

import patterns.factoryMethod.developers.CppDeveloper;
import patterns.factoryMethod.developers.Developer;

public class CppDeveloperFactory implements DevelopersFactory {

    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
