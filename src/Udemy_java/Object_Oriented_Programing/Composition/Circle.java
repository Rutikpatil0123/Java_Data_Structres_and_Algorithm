package Udemy_java.Object_Oriented_Programing.Composition;

public class Circle {

    Point one;

    double radius;

    public Circle(Point one, double radius) {
        this.one = one;
        this.radius = radius;
    }

    public Point getOne() {
        return one;
    }

    public void setOne(Point one) {
        this.one = one;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double CalculateArea(double radius){

        return Math.PI * radius * radius;
    }
}
