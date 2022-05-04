package patterns.factoryMethod.factorymethod.factories;

import patterns.factoryMethod.factorymethod.pages.MainPage;
import patterns.factoryMethod.factorymethod.pages.Page;

public class MainPageFactory implements PageFactory {

    @Override
    public Page createPage() {
        return new MainPage();
    }
}
