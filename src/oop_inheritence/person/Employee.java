package oop_inheritence.person;

public class Employee extends Person {
    private String jobTitle;
    private double salary;

    public Employee(String name, char gender, int age, String jobTitle, double salary) {
        super(name, gender, age);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle(){
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + " is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
