package oop_inheritence.shape;

public class Rectangle extends Shape {

    private double width, length;

    public Rectangle(String name, double width, double length){
        super("Rectangle");
        this.width = width;
        this.length = length;
    }

    public double area() {
        return width * length;
    }

    public double perimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "Rectangle{" +
                "name=" + getName() + ", " +
                "width=" + width +
                ", length=" + length +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
