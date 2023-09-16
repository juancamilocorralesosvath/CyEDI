package ui;
import model.*;
public class Main2 {
    public static void main(String[] args) {
        IHashTable<Integer, String> hash = new HashTable<>(10);

        hash.add(1, "Luis");
        hash.add(2, "San");
        hash.add(3, "Gregorio");
        hash.add(4, "Magno");
        hash.add(5, "Juan");
        hash.add(6, "camilo");
        hash.add(7, "corrales");
        hash.add(8, "osvath");
        hash.add(9, "el");
        hash.add(10, "profe");

    }
}
