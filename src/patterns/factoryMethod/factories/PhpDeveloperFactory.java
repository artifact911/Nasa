package patterns.factoryMethod.factories;

import patterns.factoryMethod.developers.Developer;
import patterns.factoryMethod.developers.PhpDeveloper;

public class PhpDeveloperFactory implements DevelopersFactory {

    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
