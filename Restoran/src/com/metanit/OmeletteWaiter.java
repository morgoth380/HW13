package com.metanit;
import java.util.Scanner;

public class OmeletteWaiter extends waiter{
    Scanner in = new Scanner(System.in);
    public  int eggsNum        =     2; //количество яйцов
    public  String roastDegree = "low"; //степень прожарки
    public  boolean bacon      = false; //наличие бекона
    public  boolean grass      = false; //наличие зелени
    public  boolean scramble   = false; //взбалтывать/не взбалтывать
    public  boolean tomato     = false; //наличие помидоров

    public OmeletteWaiter(){
        super("no body", "no bady", 100);
    }
    public OmeletteWaiter(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }
    public void getOrder(){   //официант принимает заказ на омлет
        System.out.println("You choiced omelette");

        System.out.println("Enter number of eggs:");
        this.eggsNum = in.nextInt();

        System.out.println("Enter degree of roast. (\"low\" or \"high\")");
        this.roastDegree = in.next();

        System.out.println("Enter need of bacon. (\"true\" or \"false\")");
        this.bacon = in.nextBoolean();

        System.out.println("Enter need of grass. (\"true\" or \"false\")");
        this.grass = in.nextBoolean();

        System.out.println("Enter need of scramble. (\"true\" or \"false\")");
        this.scramble = in.nextBoolean();

        System.out.println("Enter need of tomato. (\"true\" or \"false\")");
        this.tomato = in.nextBoolean();
    }


    public Omelette buildOrder(){         //официант передает заказ на сборку
        return new Omelette(this);
    }
}
