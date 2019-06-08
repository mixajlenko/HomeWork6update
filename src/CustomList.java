
import java.util.Arrays;
import java.util.Iterator;

public class CustomList<T> implements Custom<T> {

    private T[] values;
    private int counter = 0;
    private boolean duplicate = false;

    public CustomList() {
        values = (T[]) new Object[0];
    }

    public CustomList(int initialSize){     //два конструктора(?) нужна помощь.
        values = (T[]) new Object[0];
    }

    @Override
    public boolean add(T t) {
        try {
            T[] temp = values;
            if (counter == 0) {
                dinamic(temp, t);
                counter += 1;
            } else if (counter > 0) {
                if (contains(values, t)) {
                    duplicate = true;
                }
                if (!duplicate) {
                    dinamic(temp, t);
                } else {
                    duplicate = false;
                    return false;
                }
            }
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void remove(int index) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int anotherElementAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, anotherElementAfterIndex);
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, T t) {
        values[index] = t;
    }

    public void dinamic(T[] a, T t) {
        values = (T[]) new Object[a.length + 1];
        System.arraycopy(a, 0, values, 0, a.length);
        values[values.length - 1] = t;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(values);
    }

    @Override
    public <T> boolean contains(T[] a, T num) {
        for (T i : a) {
            if (i.equals(num)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(values == null ? "null" : Arrays.asList(values).toString());
        return sb.toString();
    }
}

