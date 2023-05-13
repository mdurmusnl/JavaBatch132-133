package Batch132.JavaTeachingB132mrSuleyman.day15ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Calisma01 {
    public static void main(String[] args) {
        //ex3    //Example 3: Create a String list, add 5 elements into it, remove the elements whose length is less than 6
        List<String> n=new ArrayList<>();
        n.add("christian");
        n.add("Alex");
        n.add("Tommy");
        n.add("Adriana");
        n.add("Tom");
       int r1= n.get(2).length();   //5   size of Tommy
        int indx=0;
       for(int i=0;i<n.size();i++){
           if(n.get(i).length()<6){
               n.remove(n.get(i));
               i--;
           }
       }
        System.out.println(n);    //  [christian, Adriana]
//2nd way   with usign a new list   we dont need to update the index  so we use for each loop   KENDI YONTEMIM
        List<String> nn=new ArrayList<>();
        nn.add("christiano");
        nn.add("Alexo");
        nn.add("Tommyo");
        nn.add("Adrianao");
        nn.add("Tomo");
        List<String > newN= new ArrayList<>();
        int inx=0;
        for(String w:nn){
            if(w.length()>=6){       // I checked greatwr than or equal to 6 and then i added it into a new list
               newN.add(inx,w);
            }
        }
        System.out.println("removed elemets less than 6 are  "+newN);   // [christiano, Tommyo, Adrianao]
//2Nd METHOD OF mr suleyman   clone the given list
        List<String> nnn=new ArrayList<>();
        nnn.add("christiano");
        nnn.add("Alexo");
        nnn.add("Tommyo");
        nnn.add("Adrianao");
        nnn.add("Tomo");
        List<String > clonedNNN= new ArrayList<>(nnn);   // we cloned nnn list
         // we re gonna move on clonedNNN and we will remove elements in real list nnn
        for(String w:clonedNNN){
            if(w.length()<6){
                nnn.remove(w);
            }
        }
        System.out.println(" clone method "+nnn);  //  [christiano, Tommyo, Adrianao]

    }
}
