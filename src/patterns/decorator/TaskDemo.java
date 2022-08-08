package patterns.decorator;

public class TaskDemo {

    public static void main(String[] args) {
//        Developer developer = new JavaDeveloper();
//        Developer developer = new SeniorJavaDeveloper(new JavaDeveloper());
        Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));

        System.out.println(developer.makeJob());
    }
}
