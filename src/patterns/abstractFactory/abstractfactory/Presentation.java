package patterns.abstractFactory.abstractfactory;

import org.working3.abstractfactory.adminpage.AdminPageFactory;
import org.working3.abstractfactory.assistant.AssistantPageFactory;
import org.working3.abstractfactory.general.PageFactory;
import org.working3.abstractfactory.userpage.UserPageFactory;

public class Presentation {
    public static void main(String[] args) {

        PageFactory admin = new AdminPageFactory();
        PageFactory user = new UserPageFactory();
        PageFactory assistant = new AssistantPageFactory();

        admin.getInfo();
        user.getInfo();
        assistant.getInfo();
    }
}
