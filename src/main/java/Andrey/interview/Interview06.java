package Andrey.interview;

public class Interview06 {
    public static void main(String[] args) throws IllegalGradeException {
        //whats is enum, and why we use enum
        //tell me enum structure, enum members?
        // like pojo class strructure
        //do we have getters and setters in enum

        //whats exception and when we have an exception what re the options we can do
        //1st option is
        //2ns option is
 //what  happens if we dont handle the exception


        //very common interview question
        //if the code u typed doestn work, then what do u do?
        //answer is: i read the error messages

        //when we call the method what is the output
        divide(7,0);


        //create a method to get any element form a String array
        String[] a = {"Tom", "Mark", "Ajda", "Cuneyt"};


          //how can u get nullPointException
       //answer is
        String s1=null;
        System.out.println(s1.length());

//create a method that prints the student grade
// and then how can you handle the issue below  . a teacher should not input a score of 980 int othe system , that increase the student average super fast
// (a student grade should be between 0 and 100)
        printGrade(980);


        //fileNotFoundException is runtime or compile time
        // ArraysIndexOfOfBound is run time or compile time exception7

        //the differences between throw and throws


    }

    public static int divide(int a,int b){
        int result=0;
        try{
            result =a/b;
            System.out.println("hi seyma");
        }catch (ArithmeticException e){
            System.out.println("do not usr zero as a divisor");
        }
        return result;
    }


    public static String getElement(String a[], int idx) {
        try {
            return a[idx];
        } catch (ArrayIndexOutOfBoundsException e) {   //if try block throw an exception than catch block will run and it must return a String, bcs of the method type
            System.out.println("do not use ind less than zero or bigger than length-1");
            return " ";   //bcs of the method return type  we must return a string
        }
    }
    public static void printGrade(int grade) {
        if(grade<0||grade>100){
            throw new IllegalArgumentException();
        }
        System.out.println("your grade is "+grade);

    }
}
