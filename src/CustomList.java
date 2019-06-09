
import java.util.Arrays;
import java.util.Iterator;

public class CustomList<T> implements Custom<T> {

    private T[] values;

    public CustomList() {
        values = (T[]) new Object[0];
    }

    @Override
    public boolean add(T t) {
            if (values.length == 0) {
                dynamic( t);
            } else  {
                if (contains(values, t)) {
                    return false;
                } else {
                    dynamic(t);
                }
            }
            return true;
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

    public void dynamic(T t) {
        T[] temp = (T[]) new Object[values.length + 1];
        System.arraycopy(values, 0, temp, 0, values.length);
        temp[temp.length - 1] = t;
        values = temp;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(values);
    }

    @Override
    public boolean contains(T[] a, T num) {
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

