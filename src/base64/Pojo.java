package base64;

import java.io.Serializable;
import java.util.Arrays;

public class Pojo implements Serializable {

    private String name;

    private String[] array;

    public Pojo(String name, String[] array) {
        this.name = name;
        this.array = array;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "name='" + name + '\'' +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
