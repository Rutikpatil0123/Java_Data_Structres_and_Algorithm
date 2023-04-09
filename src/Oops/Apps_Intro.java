package Oops;

public class Apps_Intro {

    public static void main(String args[]){

        System.out.println("This is main method");

        Car Volvo = new Car(2000000);

        Person Rutik = new Person(21, "Male");

    }

}

class Person{

    int age;
    String gender;

    Person(int age, String gender){

        age = this.age;
        gender = null;
    }

    public Person() {

    }

    public void PrintInfo(){

        System.out.println(this.age);

    }

    public String PrintInfo(int age){

        return this.gender;
    }
}

class Car extends Person {

    int costOfCar;


    Car(int costOfCar){
        super();
        costOfCar = this.costOfCar;
    }


    public void legalToDrive(int age) {

        if (age > 18) {
            System.out.println("You can drive the car");
        } else {
            System.out.println("You can not drive the car");
        }
    }
}
