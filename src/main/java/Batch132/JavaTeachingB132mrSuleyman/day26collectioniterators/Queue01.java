package Batch132.JavaTeachingB132mrSuleyman.day26collectioniterators;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
    public static void main(String[] args) {
/*
    1) Queues use FIFO rule
    2) Deque stands for Double Ended Deque it uses FIFO and LIFO   (pollFirst pollLast  or  addFirst , addLast  etc)
 */
        //creating a   Queue by LinkedList constructor
        Queue<String > que= new LinkedList<>();
        que.add("Tom");
        que.add("Ajda");
        que.add("Brad");
        que.add("Jim");
        System.out.println(que); //will be in insertion order bcs of the LinkedList()
//creating a   Queue by priortyqueue constructor
        Queue<String > myQue= new PriorityQueue<>();  //in militarty servise eduation is priorty matter
        myQue.add("Tom");                              // in a constrcution company being powerfull or talented is priorty
        myQue.add("Ajda");                             // in a hospital mergency service life risk is a priorty matter
        myQue.add("Brad");
        myQue.add("Jim");
        System.out.println(myQue);  //[Ajda, Jim, Brad, Tom]  //elements are in order according to java logic ,we can create a new logic for order
                                      // we can also set a rule  like hospital emergcy servise
    // the only way to create a Deque is use LinkedList
        Deque<String > dq= new LinkedList<>();
        dq.add("Tom");
        dq.add("Ajda");
        dq.add("Brad");
        dq.add("Jim");
        System.out.println(dq); //[Tom, Ajda, Brad, Jim]  in insertion order bcs of LinkedList
                                 // if u look at Deque method , you will notice the methods are in ....First() and ....Last()
                                // Tthe methods focus on firt and last elements

    }
}
