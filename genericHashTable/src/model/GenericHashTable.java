package model;

import java.lang.reflect.Array;

public class GenericHashTable<K, V> implements IGenericHashTable{

    // como no tiene sentido usar arrayList (porque yo quiero un)
    // tamaño fijo, entonces uso Array.
    // interesante interesante, no puedo crear arreglos genericos en java...
    private V[] table;
    // de esto no estoy muy seguro...
    // pedirle ayuda al profe!
    private Class<V> clazz;
    // este nodo "deleted" es mi referencia para saber cuándo
    // o mejor dicho en qué posición he hecho una eliminación de un
    // elemento. (para no dejar en ese espacio un valor null).
    private HashNode<K, V> deleted;
    private int size;

    // size == m
    public GenericHashTable(int size){
        this.size = size;
        // hmm.....
        table = (V[]) Array.newInstance(clazz, size);
    }
    // por que el intelliJ me puso Object en todos los metodos?
    // esta bien asi?
    // lo intento cambiar y me sale error...
    @Override
    public int hashFunction(Object key) {
        int hash = (int) key % size;
        return hash;
    }

    @Override
    public boolean add(Object key, Object value) {
        int address = hashFunction(key);
        boolean result = false;
        // lo que quiero es: si hay algo, no puedo insertar. si no hay nada,
        // entonces inserto:
        if (this.table[address] == null) {
            // y aqui me tira un error por lo del object...
            table[address] = new HashNode<K, V>(key, value);
            result = true;
        }
        return result;
    }

    @Override
    public Object search(Object key) {
        return null;
    }

    @Override
    public boolean delete(Object key) {
        return false;
    }
}
