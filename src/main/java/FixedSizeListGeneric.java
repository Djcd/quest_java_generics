import java.lang.reflect.Array;
import java.util.function.Supplier;

public class FixedSizeListGeneric<T> {

    private Object[] items;
    private int index = 0;
    private int capacity;

    public FixedSizeListGeneric(int capacity){
        this.capacity = capacity;
        this.items = new Object[capacity];
    }

    public int size(){
        return index;
    }

    public boolean add(T item) {
        if(this.index < this.capacity){
            this.items[this.index] = item;
            this.index++;
            return true;
        }
        else
            return false;
    }

    public T get(int index) {
        if(index < this.index)
            return ((T) this.items[index]);
        else
            return null;
    }
}