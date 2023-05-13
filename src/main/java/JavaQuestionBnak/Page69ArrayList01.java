package JavaQuestionBnak;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Page69ArrayList01 {
    public static void main(String[] args) {
        ArrayList<String > list= new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);  // [A, B, C, D]
        list.remove(3);   //this return string data   java prints "D"
        list.remove("A"); //THIS RETURN TRUE   ********
        System.out.println(list);

//how to convert an array to List
        int qrr[]={2,4,6,8};
        ArrayList<Integer> list1=new ArrayList<>();
        int i=0;
        do{
            list1.add(qrr[i]);
            i++;
        }while(i<qrr.length);
        System.out.println(list1);

    }
}
