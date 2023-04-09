package Oops.Polymorphism;

public class Main {

    public static void main(String[] args) {

        Shape shape = new Shape();
        Circle circle = new Circle();
        Sqaure sqaure = new Sqaure();
        Triangle triangle = new Triangle();

        shape.area();
        circle.area();
        triangle.area();
        sqaure.area();
    }
}
