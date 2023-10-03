package model;

public class ObjetoPrueba {

    private String name;
    private int years;

    public ObjetoPrueba(String name, int years){
        this.name = name;
        this.years = years;
    }

    public String getName(){
        return this.name;
    }
    public int getYears(){
        return this.years;
    }
}
