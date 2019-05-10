package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //распечатываем меню
        System.out.println("Menu:");
        System.out.println("  omelette");
        System.out.println("  pizza");
        //фабрика будет генерить один из двух возможных наборов вопросов от оффицианта, в зависимости
        //от того, что закажет клиент
        waiter Waiter = makeWaiter(); //генерим конкретный набор вопросов от оффицианта
        Cook cook1 = new Cook("Pavlik", "Morozov", 60);

        Waiter.getOrder();                  //официант принимает заказ на блюдо: записывает состав
        dish newDish = Waiter.buildOrder(); //официант формирует заказ на приготовление. Делает построение заказа
        cook1.getOrder(newDish);            //повар получает заказ на блюдо. Готовит блюдо
    }

    //метод генерит объект-набор вопросов от оффицианта в зависимости от того что хочет клиент
    static public waiter makeWaiter(){
        Scanner in = new Scanner(System.in);
        String dish;
        System.out.println("Enter the type of dish");
        dish = in.next();  //считываем желаемое блюдо
        while(!(dish.equals("omelette") || dish.equals("pizza"))){ //если выбрали что-то не то..
            System.out.println("We do not have this dish. Enter \"pizza\" or \"omelette\""); //ждем, пока не введется то что надо
            dish = in.next();
        }
        if(dish.equals("omelette")){
            return new OmeletteWaiter(); //генерим объект с набором вопросов о составе омлета
        }else{ //pizza
            return new PizzaWaiter(); //генерим объект с набором вопросов о составе пиццы
        }
    }
}
