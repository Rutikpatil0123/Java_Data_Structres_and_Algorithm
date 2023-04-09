package Oops.Inheritance;

public class Box {

    double h;
    double l;
    double w;

    Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    // cube

    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

     Box(double h, double l, double w) {
        this.h = h;
        this.l = l;
        this.w = w;
    }

    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information(){

        System.out.println("Box is running");
    }
}
