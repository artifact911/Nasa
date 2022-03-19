package patterns.builder;

import java.util.Date;

public class RegFormNewUser {

    private final String login;
    private final String password;

    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final String email;
    private final int age;
    private final Date wasBorn;
    private final Sex sex;
    private final Status status;

    public static class Builder {
        private final String login;
        private final String password;

        private String firstName;
        private String lastName;
        private String middleName;
        private String email;
        private int age;
        private Date wasBorn;
        private Sex sex;
        private Status status;

        public Builder(String login, String password) {
            this.login = login;
            this.password = password;
        }

        public Builder firstName(String val) {
            firstName = val;
            return this;
        }

        public Builder lastName(String val) {
            lastName = val;
            return this;
        }

        public Builder middleName(String val) {
            middleName = val;
            return this;
        }

        public Builder email(String val) {
            email = val;
            return this;
        }

        public Builder age(int val) {
            age = val;
            return this;
        }

        public Builder wasBorn(Date val) {
            wasBorn = val;
            return this;
        }

        public Builder sex(Sex val) {
            sex = val;
            return this;
        }

        public Builder status(Status val) {
            status = val;
            return this;
        }

        public RegFormNewUser build() {
            return new RegFormNewUser(this);
        }

    }

    public RegFormNewUser(Builder builder) {
        login = builder.login;
        password = builder.password;
        firstName = builder.firstName;
        lastName = builder.lastName;
        middleName = builder.middleName;
        email = builder.email;
        age = builder.age;
        wasBorn = builder.wasBorn;
        sex = builder.sex;
        status = builder.status;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public Date getWasBorn() {
        return wasBorn;
    }

    public Sex getSex() {
        return sex;
    }

    public Status getStatus() {
        return status;
    }
}
