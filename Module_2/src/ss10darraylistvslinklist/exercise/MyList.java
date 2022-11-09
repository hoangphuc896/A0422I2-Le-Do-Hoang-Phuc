package ss10darraylistvslinklist.exercise;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;

    public MyList() {
    }

    public MyList(int capacity) {
        E[] elements = (E[]) new Object[capacity];
    }

    public void add(int index, E element) {
        ensureCapacity(size());
        for (int i = size() - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }


    public E remove(int index) {
        checkIndex(index);
        E e = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
            elements[size - 1] = null;
            size--;
        }
        return e;
    }


    public int size() {
        return size;
    }

    public E clone() {
        E[] clone = Arrays.copyOf(elements, elements.length);
        return (E) clone;
    }

    public boolean contains(E o) {
        for (Object element : elements) {
            if (element.equals(o)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements.equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(elements.length * 2);
        }
        elements[size] = e;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        elements = Arrays.copyOf(elements, minCapacity);
    }

    public E get(int i) {
        return (E) elements[i];
    }

    public void clean() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index" + index + "out of bounds");
        }
    }
}
