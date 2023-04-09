package Bit_Manipulation;

public class BitMask {

    public static void getBit(int n, int pos){

        int bitMask = 1 << pos;

        if((bitMask & n) == 0){
            System.out.println("bit is zero");
        }else{
            System.out.println("Bit is one");
        }
    }

    public static void setBit(int n, int pos){

        int bitMask = 1 << pos;

        n = n | bitMask;

        System.out.println(n);
    }

    public static void clearBit(int n, int pos){

        int bitMask = 1 << pos;

        bitMask = ~bitMask;

        n =  n & bitMask;

        System.out.println(n);
    }

    public static void main(String[] args) {

        getBit(5,2);
        getBit(5,3);

        setBit(5,1);

        clearBit(5,0);


    }
}
