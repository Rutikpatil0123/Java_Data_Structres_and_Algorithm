package Udemy_java.Object_Oriented_Programing.Example;

public class Vehicle {

    int modelNumber;
    String companyName;

    public int calculatePrice(){
        return 10000;
    }

    public Vehicle(int modelNumber, String companyName) {
        this.modelNumber = modelNumber;
        this.companyName = companyName;
    }
}
