package patterns.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "Make codeReview...";
    }
    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
