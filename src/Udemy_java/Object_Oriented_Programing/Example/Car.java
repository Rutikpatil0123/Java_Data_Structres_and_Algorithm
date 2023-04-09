package Udemy_java.Object_Oriented_Programing.Example;

public class Car extends Vehicle{

    Engine engine;

    public Car(int modelNumber, String companyName, Engine engine) {
        super(modelNumber, companyName);
        this.engine = engine;
    }

    @Override
    public int calculatePrice() {
        return super.calculatePrice() + 15000;
    }
}
