package Batch132.JavaTeachingB132mrSuleyman.day16ArrayListANDmethodcreating;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        //ex1   create a salary list and increse salary if it s less thna 5000
        List<Double> salaries= new ArrayList<>();
        salaries.add(4500.0);
        salaries.add(6400.0);
        salaries.add(2300.0);
        salaries.add(5000.0);
        salaries.add(7150.0);
        for(double w:salaries){
            if(w<5000){
                salaries.set(salaries.indexOf(w),w*1.1);
            }
        }
        System.out.println(salaries);
// 2ND WAY
        for(double w:salaries){
            if(w>=5000){
                continue;
            }else{
                salaries.set(salaries.indexOf(w),w*1.1);
            }
        }
        System.out.println(salaries);

        System.out.println("aaaaaaaa   "+ascii("deliver"));
     String q="deliver";
     char aa=q.charAt(0);
        System.out.println(aa+" heyyy");

    }
    public static String ascii (String  s){
        int  asci=0;
        for(int i=0;i<s.length();i++){
            asci+=s.charAt(i);
        }
        return String.valueOf(asci);

    }
}
