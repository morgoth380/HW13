package com.metanit;

public class Omelette implements dish{

    private int eggsNum;        //количество яйцов
    private String roastDegree; //степень прожарки
    private boolean bacon;      //наличие бекона
    private boolean grass;      //наличие зелени
    private boolean scramble;   //взбалтывать/не взбалтывать
    private boolean tomato;     //наличие помидоров

    private String name;

    public void getDish(){
        System.out.println(this.name);
    }

    public Omelette(OmeletteWaiter Biulder){

        this.name = "omelette";

        this.eggsNum = Biulder.eggsNum;
        this.roastDegree = Biulder.roastDegree;
        this.bacon = Biulder.bacon;
        this.grass = Biulder.grass;
        this.scramble = Biulder.scramble;
        this.tomato = Biulder.tomato;
    }

}
