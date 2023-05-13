package Andrey;



public class a {
    public static void main(String[] args) {

        //make all characters of the given name in upper case and remove the spaces from the beginning and the end.
        String str = "  seyma nursah akcin   ";   //Seyma Nursah Akcin

       str= str.trim();
      String a= str.split(" ")[0].toUpperCase().substring(0,1);   //S
        String x=str.split(" ")[0];
      String b=str.split(" ")[1].toUpperCase().substring(0,1);//N
      String c=str.split(" ")[2].toUpperCase().substring(0,1);//A
        String firstName= a+x.substring(1);//  Seyma





        // String a=str.charAt(0);   //s

     /*
     Type code to get initials of the first name and the last name of a given name. Middle name
     is out of scope.
     Example: Harry Potter --> HP
      */
       String s="Harry Potter";
       char initialFirst=s.charAt(0);
       char initialLast=s.split(" ")[1].charAt(0);
        System.out.println(initialFirst +"" + initialLast);
     //   1) non primitive has method
        //2) non primitive  heap
        // 3) non primtive  Integer  String
        // 4)non primitive  infinitly many  Passanger Student
        //5)

        /*
        in an array
         */


      /*
       String initialFirst=s.substring(0,1);
       String initialLast=s.split(" ")[1].substring(0,1);
        System.out.println(initialFirst+initialLast);
        */
        //type code to check if a number is palindrome or not.
// Ex.: 1234321
        String reverse="";
     String num= "1234321";
     for(int i=num.length()-1;i>=0;i--){
         char ch=num.charAt(i);
         reverse+=ch;
     }
        System.out.println(reverse);
  if(reverse.equals(num)){
      System.out.println("its palindrom");
  }else{
      System.out.println("not");
  }






    }
}
