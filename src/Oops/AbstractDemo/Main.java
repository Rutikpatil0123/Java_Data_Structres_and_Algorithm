package Oops.AbstractDemo;

public class Main {
    public static void main(String[] args) {

        Son son = new Son();
        son.career();

        String store = son.partner();
        System.out.println(store);

        System.out.println();

        son.finish();
        Parent.Say();
    }
}
