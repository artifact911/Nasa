package patterns.factoryMethod.developers;

public class PhpDeveloper implements Developer{

    @Override
    public void writeCode() {
        System.out.println("PhpDeveloper writes PhpCode...");
    }
}
