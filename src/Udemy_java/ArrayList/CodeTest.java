package Udemy_java.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;


public class CodeTest {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("as");
        list.add("cd");
        list.add("vv");

        System.out.println(list);

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
