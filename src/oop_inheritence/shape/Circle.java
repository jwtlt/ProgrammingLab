package oop_inheritence.shape;

public class Circle extends Shape {

    private double radius;
    private static double PI;

    public Circle(String name, double radius){
        super("Circle");
        this.radius = radius;
    }

    static {
        PI = 3.14;
    }

    public double area() {
        return PI * radius * radius;
    }

    public double perimeter() {
        return 2 * PI * radius;
    }

    public String toString() {
        return "Circle{" +
                "name=" + getName() + ", " +
                "radius=" + radius + ", " +
                "area=" + area() + ", " +
                "perimeter=" + perimeter() +
                '}';
    }
}
