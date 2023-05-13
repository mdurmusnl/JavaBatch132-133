package lambdaRevision;

//  first lesson of Lambda  this Lambda study todsy is all about integers with Collections
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaRevision01 {
    /*
        1) we learnt "Structured Programming" so far , in "Structured Programming" structure is very important , we spend time on structure
        2) Lambda is "Functional Programming" , in " Functional Programming" we will focus on the fucntions(methods)
        3) "t->  code" is called "Lambda expression "  ,,in Functional Programming" structured code its not recommended
         we will prefer to use "Method Reference"
     */
    public static void main(String[] args) {
        List<Integer> nums= new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);
        printElements1(nums);  //12 9 131 14 9 10 4 12 15
        System.out.println();
        printsElement2(nums); //12 9 131 14 9 10 4 12 15
        System.out.println();
        printEvenElements1(nums);  // 12 14 10 4 12  Structured
       printEvenElements2(nums);  // 12 14 10 4 12   functional
        printSquareOfOddElements2(nums);
        printCubeOfUniqueElements1(nums);  //81 17161 81 225 2248091 3375
        System.out.println();
        System.out.println(findMin(nums));
    }
    //ex1  create a method to print all list elements on the console in the same line with a space in between
    // 1.st way " Structured programming"
    public static void printElements1(List<Integer> myList){   // regular programin   it is not lambda
   for(int w:myList){
       System.out.print(w+" ");
   }
    }
    //2nd way  used "Functional Programming"
    public static void printsElement2(List<Integer> myList){
        myList.stream().forEach(t-> System.out.println(t+" "));

    }
    // ex2  create a method to print the "even" List elements on the console
    // in the same line with a space between two consecutive elements(structured)
    //1st way used " Structured Programming"
     public static void printEvenElements1(List<Integer> myList){
        for(Integer w:myList){
            if(w%2==0){
                System.out.print(w+" ");
            }
        }
     }
     //2ns way  "Functional Programming"
  public static void printEvenElements2(List<Integer> myList ){
        myList.stream().
                filter(t->t%2==0).
                forEach(t-> System.out.println(t+" "));  // " t%2==0 "  and " t-> sout " are both Lambda Expressions  later times we wont use

  }
  //ex3 create a method to print the square of odd list elements on the consle
    //in the samle line space between
    //1st way structured
    public static void printSquaureOfOddElement1(List<Integer> myList){
        for(Integer w: myList){
            if(w%2!=0){
                System.out.print(w*w+" ");
            }
        }
    }
    //2nsd way functional progrsmming
    public static void printSquareOfOddElements2(List<Integer> myList){  //taking squre of an existing elements means updating then use map() method
        myList.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));
    }
// ex4   create a code to print "cube " of " distint"(uniqye) "odd" list elements
    //and print them with a spabe between in a line
    //1st way with "structured"    optional   teacher did not do
    public static void printCubeOfUniqueElements1(List<Integer> myList){ // there is an erorr chekc later
        for( Integer w:myList){
            if(w%2!=0){
                if(myList.indexOf(w)==myList.lastIndexOf(w)){
                    System.out.print((w*w*w)+" ");
                }
            }
        }
    }
    //2nd way with " functional    disntinct() method repeated method perfect way to find unique ones
    public static void  printCubeOfUniqueElements2(List<Integer> myList){
     myList.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.println(t+" "));
    }
    //ex5  create a method to calculate the sum of the squares of distinct even numbers   //it doesnt say print
    public static int  findSumOfSquareOfOddElements(List<Integer> myList){   //it should return an int
     return    myList.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);

    }
    //ex6 create a method to calculate the product of the square of distinct even elements
    public static int findProductOfSqusareOfDistinctEvenElements(List<Integer> myList){
        return myList.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(1,(t,u)->t*u);
    }
    //ex7   create a method to find "maximum valeu" from the list elements
    public static  int findMax(List<Integer> myList){
        return myList.stream().reduce(Integer.MIN_VALUE,(t,u)->t>u?t:u);
    }
    //2nd way for ex7
    public static  int findMax2(List<Integer> myList){
        return myList.stream().distinct().reduce(myList.get(0),(t,u)->t>u?t:u);  //better way use myList.get(0)
    }
    //3rd way for ex7  .. after sort()  it is in ascending  order so the last one is the biggest
    public static  int findMax3(List<Integer> myList){ //*** after distinct method  each element are unique
        return myList.stream().distinct().sorted().reduce((t,u)->u).get();  // reduce() method with a single parameter does not return Integer
    }  //there is no method findLast()                                        // to make return type integer use get() method
//4th way
    public static  int findMax4(List<Integer> myList){  //after sort Comparator class with reverseOrder makes in descending order and then
        return myList.   //i  can make a loggic mistake in mt own method but java method are perfect
                stream().     //java method error free perfect method
                distinct().      //java method error free perfect method
                sorted(Comparator.reverseOrder()).       //java method error free perfect method
                findFirst().get(); //findFirst() returns an optinal Integer so use get() method
    }

    //ex8 create a method to find the " min value" from the list elements
    public static int findMin(List<Integer> myList){   // check defter
        return myList.stream().distinct().reduce(Integer.MAX_VALUE,(t,u)->t<u?t:u);
    }
    //2ns way for ex8
    public static int findMin2(List<Integer> myList){   // check defter
        return myList.stream().distinct().reduce(myList.get(0),(t,u)->t<u?t:u);  // Math.min     Math.max methodlari gibi   herhangi bir list elemani sec
    }
//3rd way ex8
public static int findMin3(List<Integer> myList){   // after sort method()  use can use findFirst()  but it return Optional<Integer>  so use get9) method
    return myList.stream().distinct().sorted().findFirst().get();  //there is no findLast9) method
}
//ex9  create a method to find minimum value which is greater than 7 and even form the list( when u look for gtreater or smallest make them unique
    public static int findMinGreaterThanSeven(List<Integer> myList){
return myList.stream().distinct().filter(t->t>7&&t%2==0).sorted().findFirst().get();

    }
    //ex 10   create a method to find any value which is less than 15 and even from the list
     public static int findAnyValueLessThanFifteen(List<Integer> myList) {
         return myList.stream().distinct().filter(t -> t < 15 && t % 2 == 0).findAny().get();
     }
}
