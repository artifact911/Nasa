package patterns.factoryMethod.factorymethod.factories;

import org.working3.factorymethod.pages.OrderPage;
import org.working3.factorymethod.pages.Page;

public class OrderPageFactory implements PageFactory {

    @Override
    public Page createPage() {
        return new OrderPage();
    }
}
