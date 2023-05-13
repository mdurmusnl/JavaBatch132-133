package practices02dt;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class Q03Arrays {
    public static void main(String[] args) {


        //Type code to check if a specific element exist in an Array or not

        //String[] str=new String[6];

        String [] str= {"Ellie", "Susan", "Tom", "Brad", "Ali", "Veli"};
String name="Brad";
int counter=0;
    for (String w: str){
        if(w.equals(name)){
            counter++;
        }
        if(counter>0){
            System.out.println("exist");
        }else{
            System.out.println("not exist");
        }
    }
//2nd way   binarysearch ()
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));  //[Ali, Brad, Ellie, Susan, Tom, Veli]


    }
}
