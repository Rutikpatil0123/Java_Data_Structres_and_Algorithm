package Oops.Inheritance;

public class BoxWeight extends Box{

    double boxWeight;

     BoxWeight() {
        this.boxWeight = -1;
    }


     BoxWeight(double h, double l, double w, double boxWeight) {
         // calling parent class constructor
        super(h, l, w);
        this.boxWeight = boxWeight;
    }
}
