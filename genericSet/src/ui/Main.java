package ui;
import model.*;
import java.util.Scanner;

public class Main {
    private Scanner sc;
    private GenericSet<String> set;
    public Main(){
        sc = new Scanner(System.in);
        set = new GenericSet<>();
    }
    public void answerOption(int userOption){
        switch (userOption){
            case 0:
                System.out.println("closing app...");
                break;
            case 1:
                printSet();
                break;
            case 2:
                add();
                break;
            case 3:
                delete();
                break;
            case 4:
                isEmpty();
                break;
            case 5:
                size();
                break;
            case 6:
                contains();
                break;
            case 7:
                union();
                break;
            case 8:
                intersection();
                break;
            case 9:
                difference();
                break;
        }
    }
    public void printSet(){
        System.out.println(set.print());
    }
    public void add(){
        System.out.println("please specify the item you want to add: ");
        String res = sc.nextLine();
        set.add(res);
    }
    public void delete(){
        System.out.println("please specify the item you want to delete: ");
        String res = sc.nextLine();
        set.delete(res);
    }
    public void isEmpty(){
        System.out.println(set.isEmpty());
    }
    public void size(){
        System.out.println(set.size());
    }
    public void contains(){
        System.out.println("please specify the item you want to search/verify it is contained by the set:");
        String res = sc.nextLine();
        System.out.println(set.contains(res));
    }
    public void union(){
        GenericSet<String> newSet = new GenericSet<>();
        newSet.add("hello");
        newSet.add("world");
        System.out.println(set.union(newSet));
    }
    public void intersection(){
        GenericSet<String> newSet = new GenericSet<>();
        newSet.add("hello");
        newSet.add("world");
        System.out.println(set.intersection(newSet));
    }
    public void difference(){
        GenericSet<String> newSet = new GenericSet<>();
        newSet.add("hello");
        newSet.add("world");
        set.difference(newSet);
        printSet();
    }
    public int showMenuAndGetOption(){
        int input;
        System.out.println("\n app menu"+
                        "\n (1) print set."+
                        "\n (2) add element."+
                        "\n (3) delete element."+
                        "\n (4) verify if set is empty."+
                        "\n (5) get size of set."+
                        "\n (6) verify if element is contained by set."+
                        "\n (7) union."+
                        "\n (8) intersection."+
                        "\n (9) difference."+
                        "\n (0) exit."
                );
        input = sc.nextInt();
        sc.nextLine();
        return input;
    }
    public static void main(String[] args){
        Main m = new Main();
        int option = 0;
        do {
            option = m.showMenuAndGetOption();
            m.answerOption(option);
        }while (option != 0);
    }
}