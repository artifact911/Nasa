package step.hw.meo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class ArrayEverything<T> implements ListIterator<T> {
    private T[] arrayEverything;
    private int index = 0;

    public ArrayEverything(T[] arrayEverything) {
        this.arrayEverything = arrayEverything.clone();
    }


    protected int size() {
        return arrayEverything.length;
    }

    protected T get(int index) {
        try {
            return arrayEverything[index];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Recruit is not found because array's index has invalid value");
        }
        return null;
    }

    protected void setOld(int index, T recruit) {
        try {
            arrayEverything[index] = recruit;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Operation is unsuccessful because array's index has invalid value");
        }
    }

    @SuppressWarnings("uncheked") // точно работает, убеждаю другого, что проверять не надо
    protected void addOld(T recruit) {
        arrayEverything = Arrays.copyOf(arrayEverything, arrayEverything.length + 1);
        arrayEverything[arrayEverything.length - 1] = recruit;

        /*System.arraycopy(arrayRecruit, 0, addRecruit, 0, arrayRecruit.length);
        addRecruit[addRecruit.length - 1] = recruit;
        arrayRecruit = addRecruit;*/
    }

    protected void sort(Comparator<T> comparator) {
        Arrays.sort(arrayEverything, comparator);

    }

    public T[] getArrayEverything() {
        return arrayEverything;
    }

    @Override
    public boolean hasNext() {
        return index != arrayEverything.length;

    }


    @Override
    public T next() {
        if (index > arrayEverything.length - 1) {
            throw new NoSuchElementException("Index is not found");
        }
        T next = arrayEverything[index];
        index++;
        return next;

    }

    @Override
    public boolean hasPrevious() {
        return index != -1;
    }

    @Override
    public T previous() {

        if (index < 0) {
            throw new NoSuchElementException("Index is not found");
        }
        T next = arrayEverything[index];
        index--;
        return next;
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return 0;
    }

    @Override
    public void remove() {

    }

    @Override
    public void set(T o) {

    }

    @Override
    public void add(T o) {

    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}


