package lambdaRevision;

import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//this is the second day of Lmbda this study is all about String List elements
public class Day2Lambda01 {
    public static void main(String[] args) {
        List<String > names=new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Marry");
        names.add("Alexander");
        names.add("Alex");
        System.out.println(names);  //[Tom, Alex, Jim, Michael, Marry, Alexander, Alex]
        printSortedUpperUnique(names); //ALEX ALEXANDER JIM MARRY MICHAEL TOM
        System.out.println();
        System.out.println("sorted to their length");
        printUpperUniqueSortWithLength1(names); //TOM JIM ALEX MARRY MICHAEL ALEXANDER
        System.out.println();
        printUpperUniqueSortWithLastCharachter(names);  //MICHAEL TOM JIM ALEXANDER ALEX MARRY
        System.out.println();
        printSortedByLenghtThenFirstChar(names);
    }
    //ex1  print the list elements on the console in natural order, with upper cases and non repeatedly
    public static void printSortedUpperUnique(List<String > names){  //sorted() method without parameter puts them in alphapetic order  if they were numbers put in ascending order
        names.stream().
                sorted().   //alphambetic order
                map(t->t.toUpperCase()).  //updates
                forEach(t-> System.out.print(t+" "));
    }
    //ex2 cretae method t0 print the list elements on the console by ordering them to their length,with upper cases, un-repeatedly
  public static void printUpperUniqueSortWithLength1(List<String > names){  // sorted(Comparator.comparing(t->t.length()))   compares the strings according to their length
        names.stream().distinct().map(t->t.toUpperCase()).sorted(Comparator.comparing(t->t.length())).forEach(t-> System.out.println(t+" "));

  }
    //2nd way for ex2
    public static void printUpperUniqueSortWithLength2(List<String > names){  //much better no code only methods    BEST BEST
        names.stream().
                distinct().
                map(String::toUpperCase).  //map(t->t.toUpperCase())
                sorted(Comparator.comparing(String::length)).   //(t->t.length())
                forEach(Day2Utils::printInTheSameLineWithSpace); //forEach(t-> System.out.println(t+" "));
    }

  //ex3  create a method to print the list elements on the console by ordering them to their last charachter with upper caser and non repatedly
    public static void printUpperUniqueSortWithLastCharachter(List<String > names){
        names.stream().distinct().map(t->t.toUpperCase()).sorted(Comparator.comparing(t->t.charAt(t.length()-1))).forEach(t-> System.out.print(t+" "));
    }
    // ex4 Create a method to sort the elements according to their length then according to their first characters
    // TOM JIM ALEX ALEX MARRY MICHALE ALEXANDER ==> JIM TOM ALEX ALEX MARRY MICHALE ALELXANDER
    public static void printSortedByLenghtThenFirstChar(List<String > names){ // no need to type code  2nd way is way better withoud code  just methods
        names.stream().
                sorted(Comparator.comparing(t->t.length())).
                sorted(Comparator.comparing(t->t.charAt(0))).
                forEach(t-> System.out.print(t+" "));
    }
    //2nd way ex4
    public static void printSortedByLenghtThenFirstChar2(List<String > names){
        names.stream().
                sorted(Comparator.comparing(String::length)).
                sorted(Comparator.comparing(t->t.charAt(0))).    //  no method reference for  charAt(0) bcs of index is needed
                forEach(Day2Utils::printInTheSameLineWithSpace);
    }
   //ex5 create a method which takes the square of the length of every element, prints them distinctly in reverse order
    public static void printSquaresOfLengthDistinctlyInReverseOrder(List<String >names){
        //in Maths class or Integer Wrapper class there is no square operation so we have one option, if taking squares is very usuable for the app then u can create a method in utils otherowesie no create
        names.stream().   //  [Tom, Alex, Jim, Michael, Marry, Alexander, Alex]
                map(String::length).                //returns the lenght of each element  (3,4,3,7,5,9,4)
                distinct().                         //disticntly( We want sqaures unique so we typed it after length method)  (3,4,5,7,9)
                map(Day2Utils::getSquare).             // getSquare is our own method  we caled it from Utils class with no method paranthesis(9,16,25,49,81)
                sorted(Comparator.reverseOrder()).   // 81,49,25,16,9
                forEach(Day2Utils::printInTheSameLineWithSpace);      //:printInTheSameLineWithSpace is our own method  we caled it from Utils class with no method paranthesis
    }
  //ex6  create a method to check if the lenght of all elements are less than 12 or not
  public static boolean checkLenghtToBeLessThanTwelve(List<String >names){
        return names.stream().allMatch(t->t.length()<12);  //returns boolean and it check if all elements match the condition

  }
  //ex7 create a method to check if the initial of any element is not 'X'  (it means no element start with X)
    //if u look for no element match a condtion then use nonMatch
    public static boolean checkInitialsNotToBeX(List<String >names){
        return names.stream().
                noneMatch(t->t.startsWith("X"));  // nonMatch method check if any elements match with the contion or not  in our question none mathces
    }                                              // it returns true bcs no element start with "X

    //ex 8 create a method to check if at least one of the lement ends with "r'
    public static boolean checkLastCharToBeLowerCaseR(List<String >names){
        return names.stream().anyMatch(t->t.endsWith("r")); //it checks if any elemtns match with the condtion    if any element matches then returns true
    }

 }
