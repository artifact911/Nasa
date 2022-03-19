package step.cw.Pupil.Comporator;

public class Pupils implements Comparable<Pupils> {
    private String name;
    private Integer age;
    private Integer weight;

    public Pupils(String name, Integer age, Integer weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public int compareTo(Pupils o) {
        return this.age - o.getAge();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pupils{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
