package oop_inheritence.shape;

public class Shapes {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("Rec", 5, 5.6);

        Square square = new Square("Squ", 4.4);

        Circle circle = new Circle("Cir", 2.8);

        System.out.println("square = " + square);

        System.out.println("rectangle = " + rectangle);

        System.out.println("circle = " + circle);

        System.out.println(rectangle.getClass());
    }

}
