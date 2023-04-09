package Oops.StaticExample;

public class Main {

    public static void main(String[] args) {

        Human Rahul = new Human(22, 15000, "Rahul", true);
        Human Raj = new Human(22, 35000, "Raj", true);
        Human Rd = new Human(22, 35000, "Raj", true);

        System.out.println(Human.population);
        System.out.println(Human.population);

    }
}
