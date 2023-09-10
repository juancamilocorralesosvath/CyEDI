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
        boolean result =  false;
        if(!set.isEmpty()) {
            // modifico la lista actual.
            genericLinkedList.union(set);
            result = true;
        }
        return result;
    }

    @Override
    public boolean intersection(GenericSet<T> set) {
        boolean result =  false;
        if(!set.isEmpty()) {
            GenericLinkedList<T> interList = new GenericLinkedList<>();
            interList = genericLinkedList.intersection(set);
            // si efectivamente hay elementos comunes, entonces
            if(interList.getHead() != null) {
                // la referencia ahora apuntara a la nueva lista formada
                // por la interseccion.
                this.genericLinkedList = interList;
                result = true;
            }
        }
        return result;
    }

    @Override
    public boolean difference(GenericSet<T> set) {
        boolean result =  false;

        if(!set.isEmpty()) {
            // modifico la lista actual.
            genericLinkedList.difference(set);
            result = true;
        }
        return result;
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
    public GenericNode<T> getFirstElement(){
        return genericLinkedList.getHead();
    }
    public String print(){
        return genericLinkedList.printList();
    }
}
