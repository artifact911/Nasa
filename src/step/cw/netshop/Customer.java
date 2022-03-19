package step.cw.netshop;

public class Customer extends Person {
    private String address;
    private String phoneNumber;

    public Customer(String surName, String firstName, String middleName) {
        super(surName, firstName, middleName);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getAllInformation() {
        String info = address + " " + phoneNumber + " " + getFIO();
        return info;
    }
}
