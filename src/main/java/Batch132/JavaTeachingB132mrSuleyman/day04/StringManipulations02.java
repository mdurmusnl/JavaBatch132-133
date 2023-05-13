package Batch132.JavaTeachingB132mrSuleyman.day04;

public class StringManipulations02 {
    public static void main(String[] args) {

        //example1   get th first4 charachter form a string and conver into lower case
        //Alba    alba
        String s = "Albania";
        String t = s.substring(0, 4).toLowerCase();  ///oooo    last index is excluded  so  there are just 4 charachter is included
        System.out.println(t);

        //example2  if two strings are same or not
        String r = "Java";

        String u = "java";  // lower case j
      boolean same= r.equals(u);
        System.out.println(same);

        System.out.println("************");
        //    ==  checks adress
        //  equal method check the value
        // why do no we use ==   instead of eqauls method

        String s1= "TechPro";
        String s2= "TechPro";
        boolean same1 = s1.equals(s2);
        System.out.println(same1);
        boolean same2 = s1==s2;
        System.out.println(same2); //  TRUE   BCS referrence adress same      java doesnt create a new adress
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
         String s3= "Python";
         String s4= new String("Python");
         boolean same4= s3==s4;
         boolean same5 = s3.equals(s4);
        System.out.println(same4);
        System.out.println(same5);

    }
}
