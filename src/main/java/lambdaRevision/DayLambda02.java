package lambdaRevision;

import java.util.stream.IntStream;

//lambda study with no List,  we will learn how to use Lmabda programming without Collections
public class DayLambda02 {
    public static void main(String[] args) {
        System.out.println(getSum(7,100));
        System.out.println(getFactorial(5));
    }
    //ex1  create a method to find the sum of integers from 7 to 100
    public static int getSum(int starting , int ending){   /// IntStream is an Interface gives us a stream of numbers the we limit by rangeClosed() method
        if(starting>ending){    //we did this filter in case user can try and addition getSum(100,7)
            int temp=starting;
            starting=ending;
            ending=temp;
        }
        return IntStream.rangeClosed(starting,ending).sum();
    }
    //ex2 create a method to find multuplication of integers from 2 to 11  both included
    public static int getProduct(int starting, int ending){
        if(starting>ending){
            int temp=starting;
            starting=ending;
            ending=temp;
        }
        return IntStream.rangeClosed(starting,ending).reduce(Math::multiplyExact).getAsInt();
    }
 //ex3 create a method to calculate the factorila of a given number
    public static int getFactorial(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            n = Math.abs(n);
        }
            return IntStream.rangeClosed(1, n). //we limit the intStrem from 1 to n
                    reduce(Math::multiplyExact).getAsInt(); //reduce method reducs into an element thats product

    }



    //ex 4 create a method to calculate the sum of even integers between given two integers
    public static int getSumOfEvensBetweenTwoIntegers(int starting, int ending){
        //in java there is no java method that check even numbers so  u either type a code or if necessary and usuefull for the project then create a method in Utils class
     return    IntStream.rangeClosed(starting,ending).filter(t->t%2==0).sum();
    }

}
