package Udemy_java.Object_Oriented_Programing.Interface;

public class Test {

    public static void main(String[] args) {

        Circle c1 = new Circle(5 ,5, 10);

        Square s1 = new Square(20);

        Triangle t1 = new Triangle(6, 8);

        System.out.println(c1.CalculateArea());
        System.out.println(c1.CalculatePerimeter());

        System.out.println(s1.CalculateArea());
        System.out.println(s1.CalculatePerimeter());

        System.out.println(t1.CalculateArea());
        System.out.println(t1.CalculatePerimeter());
    }


}
