package com.metanit;

public abstract class waiter {   //официант
    private String firstName = "nemo";
    private String secondName = "nemo";
    private int age = 60;

    public waiter(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public abstract void getOrder();   //официант принимает заказ
    public abstract dish buildOrder();
    }

