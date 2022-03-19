package step.cw.netshop;

public class ApplicationBegin {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Lee", "Bruсe", "Jr");
        cust1.setAddress("China");
        cust1.setPhoneNumber("911");

        WholeSaleCustomer cust2 = new WholeSaleCustomer("Stallone", "Silvester", "Jr");
        cust2.setNumOfArray("99");
        cust2.setAddressOfArray("Japan");
        cust2.setPhoneOfArray("911");


        Order order1 = new Order("Knife", "today", cust1);
        //System.out.println(order1.toString());

        Order order2 = new Order("Cat", "yesterday", cust1);

        Order order3 = new Order("Pencils", "tomorrow", cust2);
        System.out.println(order3.toString());


    }
}
