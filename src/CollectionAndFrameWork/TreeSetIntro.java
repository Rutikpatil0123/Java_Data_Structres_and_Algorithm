package CollectionAndFrameWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetIntro {

    public static void main(String[] args) {


        List<StudentMarks> markList =  new ArrayList<>();
        markList.add(new StudentMarks(98, 88));
        markList.add(new StudentMarks(89, 70));
        markList.add(new StudentMarks(99, 100));
        markList.add(new StudentMarks(77, 55));
        markList.add(new StudentMarks(81, 84));
        markList.add(new StudentMarks(92, 28));

        Set<StudentMarks> treeSet = new TreeSet<>(markList);

        for (StudentMarks x : treeSet){
            System.out.println(x + " ");
        }

    }
}
