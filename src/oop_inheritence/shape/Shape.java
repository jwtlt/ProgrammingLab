package oop_inheritence.shape;

public class Shape {
    private String name;

    public Shape(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }

    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}

