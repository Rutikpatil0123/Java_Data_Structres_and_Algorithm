package Oops.Inheritance;

public class Main {

    public static void main(String[] args) {

        Box box = new Box();

        Box box1 = new Box(4);

        System.out.println(box.l + " " + box.h + " " + box.w);

        System.out.println(box1.l + " " + box1.h + " " + box1.w);

        BoxWeight boxWeight = new BoxWeight();

        System.out.println(boxWeight.boxWeight + " " + boxWeight.l + " " + boxWeight.w + " " + boxWeight.h);

        BoxWeight boxWeight1 = new BoxWeight(2,4,6,8);

        System.out.println(boxWeight1.boxWeight + " " + boxWeight1.l + " " + boxWeight1.w + " " + boxWeight1.h);

    }
}
