package oop_inheritence.person;

import oop_inheritence.person.Person;

public class Student extends Person {
    private int studentId;
    private String fieldOfStudy;

    public Student(String name, char gender, int age, int studentId, String fieldOfStudy) {
        super(name, gender, age);
        this.studentId = studentId;
        this.fieldOfStudy = fieldOfStudy;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public void study(){
        System.out.println(getName() + " is studying");
    }

    public String toString() {
        return "Student{" +
                "name=" + getName() +
                "studentId=" + studentId +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
