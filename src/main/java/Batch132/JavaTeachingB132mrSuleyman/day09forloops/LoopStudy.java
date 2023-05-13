package Batch132.JavaTeachingB132mrSuleyman.day09forloops;

public class LoopStudy {
    public static void main(String[] args) {
        //ex   type code tp print unique characters in a stirng
        // Hello ==> H e o
        String t = "Hello";
      for (int i = 0; i<t.length();i++){
          char ch= t.charAt(i);  //i. indekteki karakteri
        if( t.indexOf(ch)==t.lastIndexOf(ch)) {
            System.out.print(ch+" * ");
        }
      }




    }
}
