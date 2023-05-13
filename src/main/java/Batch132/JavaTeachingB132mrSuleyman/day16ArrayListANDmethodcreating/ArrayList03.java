package Batch132.JavaTeachingB132mrSuleyman.day16ArrayListANDmethodcreating;

import java.util.Arrays;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        //ex1  convert an arraylist
String a[]=new String[5];
        a[0]="Tom";
        a[1]="Ajda";
        a[2]="Cuneyt";
        a[3]="Angelina";
        a[4]="Bradd";
        //as you see Array and list made by aslist method seem same but theyere are not exactly same
        // if u will use a method with interfere the szie of a list then do not make a list with aslist method
        System.out.println(Arrays.toString(a));   //    a[] =[Tom, Tom, Tom, Tom, Tom]
        List<String > myList= Arrays.asList(a);   // myList =[Tom, Tom, Tom, Tom, Tom]    this List has soe methods of liST CLASS AND HAS NOT SOME OTHER METHODS
        System.out.println(myList);   // THE WAY THEY LOOK LIKE IS SAME   BUT THEY ARE NOT ACTUAL SAM
        //the method () which changes the size can not be used with a list made by aslist method*********
        myList.remove("Ajda");  // this code doesnt work
        System.out.println(myList);





    }
}
