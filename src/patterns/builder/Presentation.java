package patterns.builder;

public class Presentation {
    public static void main(String[] args) {

        RegFormNewUser newUser = new RegFormNewUser.Builder("user", "1111")
                .email("someEmail@mail.ru")
                .firstName("Bruce")
                .lastName("Willis")
                .build();
    }
}
