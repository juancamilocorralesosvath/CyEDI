package model;

public class GenericNode<T extends Comparable<T>> {
    private T item;
    private GenericNode<T> next;

    public GenericNode(T item){
        this.item = item;
        this.next = null;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public GenericNode<T> getNext() {
        return next;
    }

    public void setNext(GenericNode<T> next) {
        this.next = next;
    }
}
