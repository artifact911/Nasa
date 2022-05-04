package patterns.abstractFactory.abstractfactory;


import patterns.abstractFactory.abstractfactory.adminpage.AdminPageFactory;
import patterns.abstractFactory.abstractfactory.assistant.AssistantPageFactory;
import patterns.abstractFactory.abstractfactory.general.PageFactory;
import patterns.abstractFactory.abstractfactory.userpage.UserPageFactory;

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
