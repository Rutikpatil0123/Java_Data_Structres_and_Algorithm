package Udemy_java.Object_Oriented_Programing.Interface;

public class Triangle implements Shape{

    double height;

    double width;

    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double CalculateArea() {
        return 0.5 * height * width;
    }

    @Override
    public double CalculatePerimeter() {
        return width + height * 2;
    }
}
