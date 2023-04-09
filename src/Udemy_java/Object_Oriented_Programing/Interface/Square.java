package Udemy_java.Object_Oriented_Programing.Interface;

public class Square implements Shape {

    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double CalculateArea() {
        return side * side;
    }

    @Override
    public double CalculatePerimeter() {
        return side * 4;
    }
}
