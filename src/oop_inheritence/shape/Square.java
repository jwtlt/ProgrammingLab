package oop_inheritence.shape;

public class Square extends Shape {
    private double side;

    public Square(String name, double side) {
        super("Square");
        this.side = side;
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return 4 * side;
    }

    public String toString() {
        return "Square{" +
                "name=" + getName() + ", " +
                "side=" + side + ", " +
                "area=" + area() + ", " +
                "perimeter=" + perimeter() +
                '}';
    }
}

