package oop_inheritence.animal;

import java.util.ArrayList;
import java.util.Arrays;

public class Animals {
    public static void main(String[] args) {
        Dog dog1 = new Dog("lucy", "puppy", "small", "green", 'M', 1);
        Dog dog2 = new Dog("cuky", "karma", "big", "grey", 'M', 3);


        Cat cat1 = new Cat("henry", "french", "medium", "black", 'M', 2);
        Cat cat2 = new Cat("jack", "american", "big", "black", 'F', 3);


        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.addAll(Arrays.asList(dog1,dog2));

        ArrayList<Cat> cats = new ArrayList<>();
        cats.addAll(Arrays.asList(cat1,cat2));

        System.out.println(dogs + "\n" + cats);

        dog1.eat();
        dog1.move();
        dog2.move();
        dog2.bark();

        cat1.sleep();
        cat2.move();
        cat2.scratch();


    }

}
