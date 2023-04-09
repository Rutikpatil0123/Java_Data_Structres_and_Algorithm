package CollectionAndFrameWork;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueIntro {

    public static void main(String[] args) {

//        PriorityQueue<Integer> pq = new PriorityQueue<>(new CustomComparator());
        // USing lambda
        PriorityQueue<Integer> pq = new PriorityQueue<>((a ,b) -> b - a);

        pq.offer(1);
        pq.offer(0);
        pq.offer(12);
        pq.offer(8);

        List<Integer> ls = new ArrayList<>();
        int inndex = 0;
        while(!pq.isEmpty() && inndex != 2){

            ls.add(pq.poll());
            inndex++;
        }

        System.out.println(ls);
        System.out.println(pq);


        List<StudentMarks> markList =  new ArrayList<>();
        markList.add(new StudentMarks(98, 88));
        markList.add(new StudentMarks(89, 70));
        markList.add(new StudentMarks(99, 100));
        markList.add(new StudentMarks(77, 55));
        markList.add(new StudentMarks(81, 84));
        markList.add(new StudentMarks(92, 28));

        PriorityQueue<StudentMarks> marksPriorityQueue = new PriorityQueue<>(markList);

        List<StudentMarks> marks = new ArrayList<>();

        int index = 0;
        while(!marksPriorityQueue.isEmpty() && index != 3){

            marks.add(marksPriorityQueue.poll());
            index++;
        }

        System.out.println(marks);

    }
}
