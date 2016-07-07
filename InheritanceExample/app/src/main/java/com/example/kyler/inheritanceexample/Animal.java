package com.example.kyler.inheritanceexample;

/**
 * Created by kyler on 04/07/2016.
 */
public class Animal {
    String name;
    private int noOfLeg;
    private int age;

    public Animal(){}

    public Animal(String name, int noOfLeg, int age) {
        this.name = name;
        this.noOfLeg = noOfLeg;
        this.age = age;
    }

    public int getNoOfLeg() {
        return noOfLeg;
    }

    public void setNoOfLeg(int noOfLeg) {
        this.noOfLeg = noOfLeg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void breath(){
        System.out.println(this.getName()+ " is breathing");
    }

    public void move(){
        System.out.println("animal is moving");
    }

    public void eat(){
        System.out.println("animal is eating");
    }

    public void flyable(){
    }

}
