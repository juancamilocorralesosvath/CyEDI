package model;

public class GenericSet<T extends Comparable<T>> implements IGenericSet<T>{
    private GenericLinkedList<T> genericLinkedList;

    public GenericSet(){
        genericLinkedList = new GenericLinkedList<>();
    }

    // se debe asegurar que el elemento ya no exista en el conjunto
    @Override
    public boolean add(T e) {
        boolean result = false;
        if(!contains(e)){
            genericLinkedList.add(e);
            result = true;
        }
        return result;
    }

    @Override
    public boolean delete(T e) {
        return genericLinkedList.delete(e);
    }

    @Override
    public boolean union(GenericSet<T> set) {
        return false;
    }

    @Override
    public boolean intersection(GenericSet<T> set) {
        return false;
    }

    @Override
    public boolean difference(GenericSet<T> set) {
        return false;
    }

    @Override
    public boolean clear() {
        return genericLinkedList.clear();
    }

    @Override
    public boolean contains(T e) {
        return genericLinkedList.contains(e);
    }

    @Override
    public int size() {
        return genericLinkedList.getSize();
    }

    @Override
    public boolean isEmpty() {
        return genericLinkedList.isEmpty();
    }
}
