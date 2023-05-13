package Batch132.JavaTeachingB132mrSuleyman.day27enumsandexceptions;

public class E02 {
    public static void main(String[] args) {
        String[] a = {"Tom", "Mark", "Ajda", "Cuneyt"};
        getElement(a, 2);//  Ajda
        System.out.println(getElement(a, 5));  // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
        String s="Kemal";
        System.out.println(  getChar(s,3)); //a
        System.out.println(  getChar(s,7)); //Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 7 out of bounds for length 5

    }
    //ex1   create a method to get any elementy from a string array

    //1st wat to handle the issue with if statemnet but this is not recommended
   /* public static String getElement(String a[],int idx){
        if(idx<0 || idx> a.length){
            return " ";
        }else{
            return a[idx];
        }
    }     */
    //2nd way to handle to execption by try catch block
    public static String getElement(String a[], int idx) {
        try {
            return a[idx];
        } catch (ArrayIndexOutOfBoundsException e) {   //if try block throw an exception than catch block will run and it must return a String, bcs of the method type
            System.out.println("do not use ind less than zero or bigger than length-1");
            return " ";   //bcs of the method return type  we must return a string
        }
    }

    // ex2   create a method to get a characher from a string
    public static char getChar(String s, int idx ){
      try{
          return s.charAt(idx);  //if it works it returns char
      }catch (StringIndexOutOfBoundsException e){
          System.out.println("do not use idx less than zero or bigger thna length");
      }
   return ' ';    //if catch blok runs then it return char  as well
    }
}

