package patterns.abstractFactory.abstractfactory.general;

public interface PageFactory {

    NavBar getNavBar();

    Table getTable();

    Footer getFooter();

    default void getInfo() {
        getNavBar().nWork();
        getTable().tWork();
        getFooter().fWork();
    }
}
