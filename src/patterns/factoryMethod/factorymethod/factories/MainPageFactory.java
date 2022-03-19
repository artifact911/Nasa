package patterns.factoryMethod.factorymethod.factories;

import org.working3.factorymethod.pages.MainPage;
import org.working3.factorymethod.pages.Page;

public class MainPageFactory implements PageFactory {

    @Override
    public Page createPage() {
        return new MainPage();
    }
}
