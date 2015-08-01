package arraylist;


import java.util.Arrays;

/**
 * Created by tylerfolkman on 8/1/15.
 */
public class ArrayListTF<E> {

    Object [] elementData;
    private int size;
    private static final Object[] EMPTY_ELEMENTDATA = {};

    public ArrayListTF(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                    initialCapacity);
        }
    }

    private void grow(){
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public boolean add(E e){
        if (size + 1 > elementData.length){
            grow();
        }
        elementData[size++] = e;

        return true;
    }

    public int length(){
        return size;
    }

    public E get(int index){
        rangeCheck(index);
        return (E) elementData[index];
    }

    private void rangeCheck(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException();
    }

}
