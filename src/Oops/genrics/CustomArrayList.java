package Oops.genrics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }

        data[size++] = num;
    }

    private boolean isFull() {

        return size == data.length;
    }

    private void resize(){
        int[] temp = new int[data.length * 2];

        for (int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }

        data = temp;
    }

    public int remove(){

        int removed = data[--size];
        return removed;
    }

    public int get(int index){

        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }


    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
       // ArrayList list = new ArrayList();

        CustomArrayList customArrayList = new CustomArrayList();
//        customArrayList.add(5);
//        customArrayList.add(5);
//        customArrayList.add(544);
//        customArrayList.add(1);
//        customArrayList.add(0);
//        customArrayList.add(15);
//        customArrayList.add(55);

        for (int i = 0; i < 22; i++){
            customArrayList.add(i);
        }


        System.out.println(customArrayList);


    }
}
