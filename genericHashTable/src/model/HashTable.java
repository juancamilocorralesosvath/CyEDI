package model;

import java.lang.reflect.Array;

public class HashTable<K, V> implements IHashTable<K, V>{

// manera de crear un arreglo generico, o una manera de hacerlo.
    private HashNode<K, V>[] table;

    // este nodo "deleted" es mi referencia para saber cuándo
    // o mejor dicho en qué posición he hecho una eliminación de un
    // elemento. (para no dejar en ese espacio un valor null).
    private HashNode<K, V> deleted;
    private int size;

    // size == m
    public HashTable(int size){
        this.size = size;
        table = new HashNode[size];
    }

    // revisar por que esta tirando error.
    private int hashFunction(K key) {
        int hash = (int) key % size;
        return hash;
    }

    @Override
    public boolean add(K key, V value) {
        int address = hashFunction(key);
        boolean result = false;
        // lo que quiero es: si hay algo, no puedo insertar. si no hay nada,
        // entonces inserto:
        if (this.table[address] == null) {
            table[address] = new HashNode<K, V>(key, value);
            result = true;
        }
        return result;
    }

    @Override
    public V search(K key) {
        return null;
    }

    @Override
    public boolean delete(K key) {
        return false;
    }

    private String print(){
        String str = "";
        for (int i = 0; i < size; i++) {
            str += table[i].getValue();
        }

        return str;
    }
}
