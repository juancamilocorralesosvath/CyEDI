package ui;
import model.*;
public class Main2 {
    public static void main(String[] args) {
        IHashTable<Integer, String> hash = new HashTable<>(10);
/*
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
  */
        // ASCII value of a string
        String str = "Hola mundo!";
        int sum = 0;
        int RADIX_FACTOR = 128;
        int radixIndicator = str.length() - 1;

        for (int i = 0; i < str.length(); i++) {
            int asciiValue = str.charAt(i);
            sum += asciiValue * Math.pow(RADIX_FACTOR, radixIndicator);
            radixIndicator--;
        }
        System.out.println("Radix-128 integer value of string: " + sum);


    }
}
