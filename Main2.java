package ui;
import model.*;
public class Main2 {
    public static void main(String[] args) {
        IHashTable<ObjetoPrueba, ObjetoPrueba> hash = new HashTable<>(10);

        ObjetoPrueba obj1 = new ObjetoPrueba("Luis", 22);
        ObjetoPrueba obj2 = new ObjetoPrueba("San", 23);
        ObjetoPrueba obj3 = new ObjetoPrueba("Gregorio", 24);
        ObjetoPrueba obj4 = new ObjetoPrueba("Magno", 25);
        ObjetoPrueba obj5 = new ObjetoPrueba("Juan", 26);
        ObjetoPrueba obj6 = new ObjetoPrueba("camilo", 27);
        ObjetoPrueba obj7 = new ObjetoPrueba("corrales", 28);
        ObjetoPrueba obj8 = new ObjetoPrueba("osvath", 29);
        ObjetoPrueba obj9 = new ObjetoPrueba("el", 30);
        ObjetoPrueba obj10 = new ObjetoPrueba("profe", 31);


        System.out.println(hash.add(obj1, obj1));
        hash.add(obj2, obj2);
        hash.add(obj3, obj3);
        hash.add(obj4, obj4);
        hash.add(obj5, obj5);
        hash.add(obj6, obj6);
        System.out.println(hash.add(obj7, obj7));
        hash.add(obj8, obj8);
        hash.add(obj9, obj9);
        hash.add(obj10, obj10);
    }
}
