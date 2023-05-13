package Batch132.JavaTeachingB132mrSuleyman.day15ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        //Exm 1    create a string List then add 5 elements in to the list and remove a specific element
        List<String> names= new ArrayList<>();
        names.add("christian");
        names.add("Alex");
        names.add("Tommy");
        names.add("Adriana");
        names.add("Tom");
        //with remeove() method u can delete an element or an element with its index

       //remove() method returns boolean true or false   true meand done   false means not found such an element to remove
        System.out.println(names);   //[christian, Alex, Tommy, Adriana, Tom]
        names.remove("Alex");
        //   boolean isRemoved=   names.remove("Alex");        true
        System.out.println("after deleting alex");
        System.out.println(names);   //[christian, Tommy, Adriana, Tom]
        names.remove(2);   //   removes Adriana    ***  it returns u removed element
         //  String removedelement=names.remove(2);   it returNS Adriana
        //  **  remove ()method with index  return the element  id doesnt not retur true or false
        System.out.println(names);  // [christian, Tommy, Tom]

        //ex2   createan integer List , add 6 elelemnt in the listt   remove a specific element
        List<Integer> ages=  new ArrayList<>();
        ages.add(12);
        ages.add(13);
        ages.add(7);
        ages.add(32);
        ages.add(1);
        ages.add(55);
        System.out.println(ages);
        // if u put an integer in to removve method paranthesis  java accepts it as primitive int
        //if the number you put inside the remove method is primitive ,it will be considered as index
       // ages.remove(13);  this syntax does not remore element 13
      //  ages.remove(1);   //     this syntaz removes element 14
        //or another way to remove element 13, the bottom one is best to remove element 13
        ages.remove((Integer) 13);  // this syntaz removes element 13   ***  do not type prmitive data   otherwise java consider it as index
        //   boolean isRemoved2= ages.remove((Integer)13);    true
        System.out.println(ages);
//ex3    //Example 3: Create a String list, add 5 elements into it, remove the elements whose length is less than 6
   List<String> n=new ArrayList<>();
        n.add("christian");
        n.add("Alex");
        n.add("Tommy");
        n.add("Adriana");
        n.add("Tom");
        n.get(2).length();
//if we need to work with index , u can not ue for each loop
        /*
     for(int i=0;i<n.size();i++){
         if(n.get(i).length() <6){      //   n.get(i)   given an element     n.get(i).lenth() =number of charachter
             n.remove(n.get(i));
             i--;   //   ***   after removing element we need to update the new list length
         }
     }
        System.out.println(n);   //[christian, Adriana]


         */
        // 2nd way  if we use clone of the list   and remove from the list then we dont need to update the length of list
        //   *****
        List<String> clonedN= new ArrayList<>(n);   // it s copying list n= [christian, Alex, Tommy, Adriana, Tom]
        for(String w:clonedN){   // ****
            if(w.length()<6){
                n.remove(w);  //ww  clooneN uzerinde geziyoruz   ama gercek listeden siliyoruz  o yuzden  index guncelllemesi gerekmiyor
            }
        }
        System.out.println(n);    ///[christian, Adriana]




    }
}
