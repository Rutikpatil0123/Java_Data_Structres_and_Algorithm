package Udemy_java.Object_Oriented_Programing.Gerics;

public class CodeTest {

    public static void main(String[] args) {

        welcome("Rutik");
        welcome(12);

        GericClass<String> ge = new GericClass<>();

        ge.setT("Hello baby");

        String s = ge.getT();

        System.out.println(s    );

    }

    public static <T> void welcome(T name){

        System.out.println("Welcome to " + name );
    }
}
