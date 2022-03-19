package step.cw.netshop;

public abstract class Person {
    private Long id;
    private String surName;
    private String firstName;
    private String middleName;
    private int age;
    private static Long scorePer = 0L;

    public Person(String surName, String firstName, String middleName) {
        this.surName = surName;
        this.firstName = firstName;
        this.middleName = middleName;
        setId(scorePer);
        scorePer++;


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFIO() {
        return surName + " " + firstName + " " + middleName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String getAllInformation();


}
