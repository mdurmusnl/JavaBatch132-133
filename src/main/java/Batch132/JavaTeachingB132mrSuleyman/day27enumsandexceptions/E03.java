package Batch132.JavaTeachingB132mrSuleyman.day27enumsandexceptions;

public class E03 {
    public static void main(String[] args) {
        String s1="Kemal";
        System.out.println(getNumOfCharachter(s1));
        String s2=null;
        System.out.println(getNumOfCharachter(s2));
        String s="123";
        System.out.println(convertStringToInt(s)+2);  //125
        String s3="1a2b";
        System.out.println(convertStringToInt(s3));//  //  .NumberFormatException
    }
    //ex 1:   create a method to get the number of character in a string
    public static int getNumOfCharachter(String s){
        try{
            return s.length();
        }catch (NullPointerException e){
            return 0;
        }
    }
    //ex2:  crete a method t o convert a string to an integer
    public static int convertStringToInt(String s) {
        try {
            return Integer.valueOf(s);
        }catch (NumberFormatException e){
            System.out.println(s+ " has non digit charachter");  //                public people
            System.out.println(e.getMessage()); // For input string: "1a2b"        technical people    we can prin the eror  code works and print the error
            e.printStackTrace(); // it print all the detail error mesaage no need sout
            return 0;
        }
    }
}
