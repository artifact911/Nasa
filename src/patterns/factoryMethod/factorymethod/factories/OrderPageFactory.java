package patterns.factoryMethod.factorymethod.factories;

import patterns.factoryMethod.factorymethod.pages.OrderPage;
import patterns.factoryMethod.factorymethod.pages.Page;

public class OrderPageFactory implements PageFactory {

    @Override
    public Page createPage() {
        return new OrderPage();
    }
}
