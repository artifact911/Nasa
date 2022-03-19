package step.cw.netshop;

public class WholeSaleCustomer extends Person {
    private String numOfArray;
    private String phoneOfArray;
    private String addressOfArray;
    //private Person person;

    public WholeSaleCustomer(String surName, String firstName, String middleName) {
        super(surName, firstName, middleName);
    }

    @Override
    public String getAllInformation() {
        String info = numOfArray + " " + phoneOfArray + " " + getFIO();
        return info;
    }

    public String getNumOfArray() {
        return numOfArray;
    }

    public void setNumOfArray(String numOfArray) {
        this.numOfArray = numOfArray;
    }

    public String getPhoneOfArray() {
        return phoneOfArray;
    }

    public void setPhoneOfArray(String phoneOfArray) {
        this.phoneOfArray = phoneOfArray;
    }

    public String getAddressOfArray() {
        return addressOfArray;
    }

    public void setAddressOfArray(String addressOfArray) {
        this.addressOfArray = addressOfArray;
    }
}
