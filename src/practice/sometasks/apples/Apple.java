package practice.sometasks.apples;

import java.util.Objects;
public class Apple {
    private String sort;
    private Integer weight;
    private Integer number;
    private String month;

    public Apple(String sort, Integer weight, Integer number, String month) {
        this.sort = sort;
        this.weight = weight;
        this.number = number;
        this.month = month;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
