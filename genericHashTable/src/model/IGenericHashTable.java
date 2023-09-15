package model;

public interface IGenericHashTable<K, V> {
    // hash function that will determine
    public int hashFunction(K key);
    public boolean add(K key, V value);
    public V search(K key);
    public boolean delete(K key);
}
