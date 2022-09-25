package oop_inheritence.person;

import oop_inheritence.person.Employee;

public class Tester extends Employee {
    public Tester(String name, char gender, int age, String jobTitle, double salary) {
        super(name, gender, age, jobTitle, salary);
    }

    public void createTicket(){
        System.out.println(getName() + " creates ticket");
    }

    public String toString() {
        return super.toString();
    }
}
