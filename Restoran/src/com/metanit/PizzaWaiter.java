package com.metanit;

import java.util.Scanner;

public class PizzaWaiter extends waiter {
    Scanner in = new Scanner(System.in);

    public  boolean bacon = false;      //наличие бекона
    public  boolean grass = false;      //наличие зелени
    public  boolean tomato = false;     //наличие помидоров
    public  boolean cheese = false;     //наличие сыра
    public  boolean fungus  = false;    //наличие грибов
    public  boolean sausage  = false;   //наличие колбасы
    public  boolean pepper  = false;    //наличие перца

    public PizzaWaiter(){
        super("no body", "no bady", 100);
    }
    public PizzaWaiter(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    public void getOrder(){   //официант принимает заказ на пиццу
        System.out.println("You choiced pizza");

        System.out.println("Enter need of bacon. (\"true\" or \"false\")");
        this.bacon = in.nextBoolean();

        System.out.println("Enter need of grass. (\"true\" or \"false\")");
        this.grass = in.nextBoolean();

        System.out.println("Enter need of tomato. (\"true\" or \"false\")");
        this.tomato = in.nextBoolean();

        System.out.println("Enter need of cheese. (\"true\" or \"false\")");
        this.cheese = in.nextBoolean();

        System.out.println("Enter need of fungus. (\"true\" or \"false\")");
        this.fungus = in.nextBoolean();

        System.out.println("Enter need of sausage. (\"true\" or \"false\")");
        this.sausage = in.nextBoolean();

        System.out.println("Enter need of pepper. (\"true\" or \"false\")");
        this.pepper = in.nextBoolean();
    }

    public Pizza buildOrder(){         //официант передает заказ на сборку
        return new Pizza(this);
    }

}
