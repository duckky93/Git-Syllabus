package com.example.kyler.inheritanceexample;

/**
 * Created by kyler on 04/07/2016.
 */
public class Bird extends Animal {

    private String name;

    public Bird(String name, int noOfLeg, int age) {
        super(name, noOfLeg, age);

    }
//    @Override
//    public void speak() {
//        System.out.println("Bird speaks \"aow\"");
//    }

    @Override
    public void move() {
        this.name = "abc";
        super.name = "Hello";
        System.out.println(this.name +" and "+super.name);
    }

    @Override
    public void flyable() {
        System.out.println("Bird can fly");
    }
}
