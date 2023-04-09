package Oops.StaticExample;

public class InnerClasses {

   static class Test{
        String name;

        Test(String name){
            this.name = name;
        }


    }

    public static void main(String[] args) {

        Test a = new Test("Rahul");
        Test b = new Test("Kunal");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
