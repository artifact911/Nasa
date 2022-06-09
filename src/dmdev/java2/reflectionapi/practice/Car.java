package dmdev.java2.reflectionapi.practice;

@Table(table = "garage", schema = "car")
public class Car {

    @Column(columnName = "brand")
    private String brand;

    @Column(columnName = "model")
    private String model;


    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
