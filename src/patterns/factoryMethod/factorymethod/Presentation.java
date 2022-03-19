package patterns.factoryMethod.factorymethod;

import org.working3.factorymethod.factories.LoginPageFactory;
import org.working3.factorymethod.factories.MainPageFactory;
import org.working3.factorymethod.factories.OrderPageFactory;
import org.working3.factorymethod.factories.PageFactory;

public class Presentation {
    public static void main(String[] args) {

        createPageBySpecific(PageType.MAIN).createPage().showPage();
        createPageBySpecific(PageType.ORDER).createPage().showPage();

    }

    public static PageFactory createPageBySpecific(PageType type) {

        switch (type) {
            case LOGIN: {
                return new LoginPageFactory();
            }
            case MAIN: {
                return new MainPageFactory();
            }
            default: {
                return new OrderPageFactory();
            }
        }
    }
}
