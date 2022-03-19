package step.cw.netshop;

public class Order {
    private Long id;
    private String name;
    private String dateTime;
    private Person customer;
    private static Long score = 0L;


    public Order(String name, String dateTime, Person customer) {
        this.name = name;
        this.dateTime = dateTime;
        this.customer = customer;
        this.id = score++;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }


    @Override
    public String toString() {
        //String.format();
        return "Название: " + name + '\n' + "Дата: " + dateTime + '\n' + "Заказчик: " + customer.getAllInformation();

    }
}
