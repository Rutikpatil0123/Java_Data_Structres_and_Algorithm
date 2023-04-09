package Oops;

public class Main {

    public static void main(String args[]){

        Students Mark = new Students();

        System.out.println(Mark.name);
        Mark.marks = 89;
        Mark.rollNumber = 9;
        Mark.name = "Mark";

        Mark.display(Mark);

        Students Rahul = new Students(22, 92, "Rahul");
        Rahul.display(Rahul);
    }
}

class Students{

    int rollNumber;
    int marks;
    String name;

    Students(){

    }
    Students(int rollNumber, int marks, String name){
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.name = name;
    }
    public void display(Students obj){
        System.out.println(obj.name);
        System.out.println(obj.marks);
        System.out.println(obj.rollNumber);
    }
}
