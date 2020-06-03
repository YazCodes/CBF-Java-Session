package org.example;

public class Person {

    // Types of Variables
    private double height;
    private String gender;
    private int age;
    private String name;

    //Methods - pass through variables into a method using parameters . 1 - put the type of variable first e.g - int

    // gets called whenever there is a key word
    // constructor
    // Instansiating Amy with all these values
    //cannot overload a constructor, but you can overload a method
    public Person(double h, String g, int a){
        this.height = h;   // this is used - refers to the current instant of that class
        this.gender = g;
        this.age = a;
    }

    //getters and setters  - used to access private variables

    public void setAge(int a){
        this.age = a;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(double h){
        this.height = h;
    }

    public double getHeight() {
        return height;
    }


    public void move() {

    }

    public void talk() {

    }

    public void sleep() {

    }
}
