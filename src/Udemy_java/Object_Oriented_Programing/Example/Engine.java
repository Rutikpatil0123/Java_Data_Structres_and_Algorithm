package Udemy_java.Object_Oriented_Programing.Example;

public class Engine {

    int manufactureYear;
    String manufactureCompany;

    public Engine(int manufactureYear, String manufactureCompany) {
        this.manufactureYear = manufactureYear;
        this.manufactureCompany = manufactureCompany;
    }

    public int setMaxSpeedRotationSpeed(){
        return 1000;

    }
}
