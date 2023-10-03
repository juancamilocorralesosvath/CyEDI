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
    private static final double KNUTH =  (Math.sqrt(5) - 1) / 2.0;
    private static final int RADIX_FACTOR = 128;

    // size == m
    public HashTable(int size){
        this.size = size;
        table = new HashNode[size];
    }

    // OJO: recibo un objeto, de ese objeto recibo un toString
    // a ese toString le hago el proceso de ASCII para hacer la función hash.
    private int hashFunction(K object) {
        // 1. saco el toString del objeto
        String info = object.toString();
        // 2. ese toString lo convierto a entero con lo que vimos de ASCII
        int key = object.hashCode();
        //long key = radix128Ascii(info);
        // 3. metodo de la multiplicacion para hacer el hash
        int hash = (int) Math.floor( size * ( (key * KNUTH) % 1 ) );
        return hash;
    }
    private long radix128Ascii(String str){
        long sum = 0;
        int radixIndicator = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            int asciiValue = str.charAt(i);
            sum +=  asciiValue * Math.pow(RADIX_FACTOR, radixIndicator);
            radixIndicator--;
        }
        return sum;
    }

    // se debe hacer testing
    @Override
    public boolean add(K key, V value) {
        int address = hashFunction(key);
        boolean result = false;
        HashNode<K, V> newNode = new HashNode<>(key, value);
        System.out.println("resultado de la hash function: " + address);
        // CHAINING
        if (this.table[address] == null) {
            table[address] = newNode;
            result = true;
        }else{
            HashNode<K, V> current = this.table[address];
            this.table[address] = newNode;
            current.setPrev(newNode);
            newNode.setNext(current);
            result = true;
        }
        return result;
    }

    @Override
    public V search(K key) {

    }

    @Override
    public V delete(K key) {
        int address = hashFunction(key);
        V result = null;
        HashNode<K, V> current = this.table[address];
        // me ubico en la posicion del arreglo
        if(current != null){
            result =  current.getValue();
            if(current.getNext() != null){
                current = current.getNext();
                current.setPrev(null);
                this.table[address] = current;
            }else{
                current = null;
            }
        }
        return result;
    }
/* 
    private String print(){
        String str = "";
        for (int i = 0; i < size; i++) {
            str += table[i].getValue().toString();
        }

        return str;
    }
    */

    @Override
    public void print() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'print'");
    }
}
