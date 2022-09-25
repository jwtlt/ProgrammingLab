package oop_inheritence.animal;

public class Cat extends Animal {

    public Cat(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void scratch(){
        System.out.println(name + " is scratching");
    }
}
