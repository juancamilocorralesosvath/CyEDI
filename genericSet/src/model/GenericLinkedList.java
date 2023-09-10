package model;

public class GenericLinkedList<T extends Comparable<T>> {
    private GenericNode<T> head;
    private int size = 0;

    public GenericLinkedList(){
        this.head = null;
    }

    public GenericNode<T> getHead() {
        return head;
    }

    public void setHead(GenericNode<T> head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(T item){
        GenericNode<T> helper = new GenericNode<>(item);
        add(helper);
        size++;
    }
    // LIFO approach
    private void add(GenericNode<T> node){
        // when list is empty
        if (this.head == null){
            this.head = node;
        } else {
            // el siguiente de mi nodo sera el que
            // hasta ahora era la cabeza.
            node.setNext(this.head);
            // el previo de la anterior cabeza sera el nuevo nodo.
            this.head = node;

        }
    }
    public String printList(){
        return printList(this.head);
    }
    private String printList(GenericNode<T> current){
        String str = "";
        // dos casos base: cuando la lista esta vacia
        // y cuando llego al final de la lista
        // list is empty
        if(this.head == null){
            str = "list is empty";
        } else if (current.getNext() == null) {
            str += "" + current.getItem();
        }else {
            str += current.getItem() + " " + printList(current.getNext());
        }
        return str;
    }

    public boolean contains(T e){
        boolean result = false;
        GenericNode<T> current = this.head;
        while( !result  || current != null){
            if (current.getItem().compareTo(e) == 0) result = true;
            current = current.getNext();
        }
        return result;
    }
    public boolean isEmpty(){
        return this.head == null;
    }
    public boolean clear(){
        boolean result = false;
        if (this.head != null) {
            this.head = null;
            result = true;
        }
        return result;
    }
    public boolean delete(T e){
       boolean result = false;
       GenericNode<T> current = this.head;
       GenericNode<T> prev = null;
       if (this.head.getItem().compareTo(e) == 0){
           this.head = this.head.getNext();
           result = true;
       }else{
           while( !result  || current != null){
               if (current.getItem().compareTo(e) == 0) {
                   prev.setNext(current.getNext());
                   result = true;
               }
               prev = current;
               current = current.getNext();
           }
       }
        return result;
    }
}
