package patterns.factoryMethod;

import patterns.factoryMethod.factories.CppDeveloperFactory;
import patterns.factoryMethod.factories.DevelopersFactory;
import patterns.factoryMethod.factories.JavaDeveloperFactory;
import patterns.factoryMethod.factories.PhpDeveloperFactory;

public class Program {
    public static void main(String[] args) {

        DevelopersFactory developersFactory = createDeveloperBySpecialization(DevType.JAVA);
        developersFactory.createDeveloper().writeCode();

//        createDevWithoutFactory(DevType.PHP).writeCode();

    }


    public static DevelopersFactory createDeveloperBySpecialization(DevType devType) {
        if (devType.equals(DevType.JAVA)) {
            return new JavaDeveloperFactory();
        } else if (devType.equals(DevType.CPP)) {
            return new CppDeveloperFactory();
        } else {
            return new PhpDeveloperFactory();
        }
    }
//    public static Developer createDevWithoutFactory(DevType devType) {
//
//        if (devType.equals(DevType.JAVA)) {
//            return new JavaDeveloper();
//        } else if (devType.equals(DevType.CPP)) {
//            return new CppDeveloper();
//        } else {
//            return new PhpDeveloper();
//        }
//    }
}
