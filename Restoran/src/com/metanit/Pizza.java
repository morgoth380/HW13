package com.metanit;

public class Pizza implements dish{
    public  boolean bacon;      //наличие бекона
    public  boolean grass;      //наличие зелени
    public  boolean tomato;     //наличие помидоров
    public  boolean cheese;     //наличие сыра
    public  boolean fungus;    //наличие грибов
    public  boolean sausage;   //наличие колбасы
    public  boolean pepper;    //наличие перца

    private String name;

    public void getDish(){
        System.out.println(this.name);
    }

    public Pizza(PizzaWaiter Biulder) {

        this.name = "pizza";

        this.bacon = Biulder.bacon;
        this.grass = Biulder.grass;
        this.tomato = Biulder.tomato;
        this.cheese = Biulder.cheese;
        this.fungus = Biulder.fungus;
        this.sausage = Biulder.sausage;
        this.pepper = Biulder.pepper;
    }

}

