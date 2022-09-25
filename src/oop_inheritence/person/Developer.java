package oop_inheritence.person;

public class Developer extends Employee {
    public Developer(String name, char gender, int age, String jobTitle, double salary) {
        super(name, gender, age, jobTitle, salary);
    }

    public void fixingBugs(){
        System.out.println(getName() + " is fixing the bugs");
    }

    public String toString() {
        return super.toString();
    }
}
