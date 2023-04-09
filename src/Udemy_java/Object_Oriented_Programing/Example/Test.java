package Udemy_java.Object_Oriented_Programing.Example;

public class Test {

    // Example for understanding of inheritance and Composition

    // inheritance used for is - a relationship

    // Composition is used for has - a relationship

    public static void main(String[] args) {

        Engine TDI = new Engine(2016, "VW");

        Car Polo = new Car(2019, "Vw", TDI);


        System.out.println(Polo.engine.setMaxSpeedRotationSpeed());

        System.out.println(Polo.calculatePrice());



    }
}
