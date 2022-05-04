package patterns.factoryMethod.factorymethod;

import patterns.factoryMethod.factorymethod.factories.LoginPageFactory;
import patterns.factoryMethod.factorymethod.factories.MainPageFactory;
import patterns.factoryMethod.factorymethod.factories.OrderPageFactory;
import patterns.factoryMethod.factorymethod.factories.PageFactory;

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
