import java.lang.reflect.Array;
import java.util.function.Supplier;

public class FixedSizeList {

    private Object[] items;

    private int index = 0;

    private int capacity;

    public FixedSizeList(int capacity){
        this.capacity = capacity;
        this.items = new Object[capacity];
    }

    public boolean add(Object item) {
        if(this.index < this.capacity){
            this.items[this.index] = item;
            this.index++;
            return true;
        }
        else
            return false;
    }

    public Object get(int index) {
        if(index < this.index)
            return this.items[index];
        else
            return null;
    }
}