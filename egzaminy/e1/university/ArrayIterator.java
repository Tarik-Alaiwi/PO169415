package university;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
    private final T[] arr;
    private int currID;

    public ArrayIterator(T[] arr) {
        this.arr = arr;
        this.currID = 0;
    }

    @Override
    public boolean hasNext() {
        return currID<arr.length;
    }

    @Override
    public T next() {
        return arr[currID++];
    }
}
