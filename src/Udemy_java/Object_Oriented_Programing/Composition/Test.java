package Udemy_java.Object_Oriented_Programing.Composition;

public class Test {

    public static void main(String[] args) {

        Point one = new Point(5, 5);

        Circle first = new Circle(one, 10.0);

        System.out.println(first.CalculateArea(10));

    }
}
