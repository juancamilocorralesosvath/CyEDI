package model;

public interface IHashTable<K, V> {
    public boolean add(K key, V value);
    public V search(K key);
    public boolean delete(K key);
}
