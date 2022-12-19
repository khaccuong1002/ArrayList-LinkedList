import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static  final  int DEFAULT_CAPACITY = 10;
    private E[] data;

    public MyList() {
        data = (E[]) new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        if (size > data.length) {
            int biggerSize = size * 2 + 1;
            data = Arrays.copyOf(data, biggerSize);
        }
    }

    public void add(E e) {
        size += 1;
        ensureCapa();
        data[size -1] = e;
    }

    public E get(int index) {
        if (index >= 0 && index < size) {
            return data[index];
        }
        return null;
    }

    public E[] getData() {
        return this.data;
    }

    public boolean remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                data[i] = data [i +1];
            }
            size -= 1;
            return true;
        }
        return false;
    }
}
