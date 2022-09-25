package oop_inheritence.person;

import oop_inheritence.person.Developer;

public class Persons {
    public static void main(String[] args) {
        Developer developer = new Developer("ahmet", 'M', 25, "SDET", 254000);
        developer.fixingBugs();
        System.out.println(developer);
    }
}
