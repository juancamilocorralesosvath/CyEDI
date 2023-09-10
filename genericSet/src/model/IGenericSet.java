package model;

public interface IGenericSet<T extends Comparable<T>> {
    boolean add(T e);
    boolean delete(T e);
    boolean union(GenericSet<T> set);
    boolean intersection(GenericSet<T> set);
    boolean difference(GenericSet<T> set);
    boolean clear();
    boolean contains(T e);
    int size();
    boolean isEmpty();
}
