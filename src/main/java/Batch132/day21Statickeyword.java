package Batch132;

public class day21Statickeyword {
/*
1 statci variable and static methods are common element for all objects   .visible like a moon
if u make a change on static smt the all object get know it and use new updated data
variables and methods are called class members
2  static class members are element of class     non static class members are element of object
if we create 100 object from a class then 100 non static variables are created as well but only one static variable is created and independent from number of object creation
no need to create  an object to access static class variables. but we need to create an object to reach non static class memebers
 3  stattic variable ==class variabel
     instance variable = instance variable (gorunen)
 */
     public static String stdName="Tom Hanks";
     public  int age= 13;
  // type a code to get the initla of first name and last name
     public static String getInitials(String  name){   // name= Ali Can     STATIC METHOD
          String first= name.substring(0,1);
          String last= name.split(" ")[1].substring(0,1);
          return first+last;// AC
     }
     //non static method
     // type a code to count the VOWELS  in the name of a student
  public int countVowels(String name){
          int counter=0;
          for(int i=0;i<name.length();i++){ // in multi optional check , use switch
              char ch= name.toLowerCase().charAt(i);
               switch (ch){
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                         counter++;
                         break;
               }
          }
          return counter;
  }


}
