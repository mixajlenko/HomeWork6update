import java.util.Iterator;
import java.util.function.Consumer;

public class ArrayIterator<T> implements Iterator<T> {

    private int index = 0;
    T[] value;

    public ArrayIterator(T[] value) {
        this.value = value;
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer<? super T> action) {

    }

    @Override
    public boolean hasNext() {
        return index < value.length;
    }

    @Override
    public T next() {
        return value[index++];
    }
}
