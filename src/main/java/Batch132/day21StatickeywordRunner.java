package Batch132;

import java.util.List;

public class day21StatickeywordRunner {
    public static void main(String[] args) {
        System.out.println(day21Statickeyword.stdName); //tom hanks
        day21Statickeyword std1= new day21Statickeyword();  // since stdName was static we had access with calss name
        System.out.println(std1.age); //13  we had access with the help of an object
  String initials= day21Statickeyword.getInitials("tom hanks");  // we can have access to static method by class name
        System.out.println(initials);  //th
        // but we need to create an object to access  non stactic method
       int vowels= std1.countVowels("Angelina Jolie");
        System.out.println(vowels); //7
        // u can  access  static method by an object bot nor recommmended  ************ important
        // accees to static methods by calss name
        // array. u get all static method  bcs String is  CLASS
        // super fancy way to make a list and add the elements
        List <String >names=List.of("ali","tom","Mark");
        System.out.println(names);  //[ali, tom, Mark]

     }

}
