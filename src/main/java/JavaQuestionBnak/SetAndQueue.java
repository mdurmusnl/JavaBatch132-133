package JavaQuestionBnak;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class SetAndQueue {
    public static void main(String[] args) {
        Queue <Integer> queue= new LinkedList<>();
        queue.add(3);
        queue.add(5);
        queue.add(7);
        queue.add(9);
        queue.add(11);
        queue.add(13);
        System.out.println(queue);// [3, 5, 7, 9, 11, 13]
        int count=0;
        while(queue.isEmpty()==false){   //if queue is not empty keep working in the loop
            queue.remove();
            count++;
            if(count==3){
                break;   //when the count is 3 then break the loop   it means stop removing elements ater 3times removing
            }
        }
        System.out.println(queue);//[9, 11, 13]
        Queue <Integer> queue1= new LinkedList<>();
        queue1.add(23);
        queue1.add(11);
        queue1.add(44);
        System.out.println(queue1); // [23, 11, 44]
        //queue1.poll();  // removes the first element
        //queue1.remove(); //removes the first element
        System.out.println(queue1.remove());//retrieves and removes the first element
         System.out.println(queue1); // [11, 44]
   Queue<String > q=new PriorityQueue<>();
   q.add("Teddy");
   q.add("Mark");
   q.add("Leo");
   q.add("Alex");
   System.out.println(q);  // Creates a PriorityQueue with the specified initial capacity that orders its elements according to their natural ordering.
   q.remove();// [Mark, Teddy]
        System.out.println(q);


    }


}
