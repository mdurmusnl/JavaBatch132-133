package Batch132.JavaTeachingB132mrSuleyman.day07ifstatementternarystatement;

public class IfStatement01 {
    public static void main(String[] args) {
//exanple 1   type a code to check if a given charachter is upper case or lowers case
        char ch ='S';
        if(ch>='A' && ch<='Z'){
            System.out.println("Upper case");
        }else if(ch>='a'&&ch<='z'){
            System.out.println("lower case");
          }else{
            System.out.println("others....");
            System.out.println("******************************");
            //Example 2: If a number is less than 300 or greater than 3000
//           print "Perfect Number" on the console, otherwise
//           print "Regular Number" on the console.
            //     || means or

        }
        int num = 4200;
        if(num<300 || num>3000){
            System.out.println("Perfect number");
        }else {    //no condition
        }
        System.out.println("Regular number");
     // Example 3  tyoe a code to check if a number is even or odd
        //   % macilis okunusu
     int n=8;
     if(n%2==0){
         System.out.println("even");
     }else{
         System.out.println("odd");
     }
//Example 4 ;  type code to print the number of months for the given motnh name
        String monthName ="January";
     if(monthName.equals("January")){   // monthName.equalsIgnoreCase("february");
         System.out.println("1");
     }else if(monthName.equals("February")){
         System.out.println("2");
     }else if(monthName.equals("March")){
         System.out.println("3");
     }else if(monthName.equals("April")){
         System.out.println("4");
     }







    }
}
