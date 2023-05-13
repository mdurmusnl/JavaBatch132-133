package Batch132.JavaTeachingB132mrSuleyman.day28Exceptions;

public class E02 {
    public static void main(String[] args) {
        printAge(23);// 23
        printAge(-23);
    }
    //ex 1    create a method to print users age, if the age is negative then the age shouldnt be printed
    //
    public static void printAge(int age){
        if(age<0){
            throw new IllegalArgumentException("age can not be less than zero");   //unrelated date warning(for example negative ages)  it blocks the app
        }                                                                        /// thr message is optional to type
        System.out.println(" your age is "+ age);      //whenever u want u can throw  IllegalArgumentException
    }
    //ex2   create  a method to print student grade   if the grade is less thna zero or greater than 100 the method should throw an exception with a message
    public static void printGrade(int grade){
        if(grade<0||grade>100){
            throw new IllegalArgumentException(" the grade is suppose to be bigger than zero or less thna 100");
            }
        System.out.println("your grade is "+grade);

        }
        //2nd way
        public static void printGrade2(int grade){   //grade is parameter
            if(grade<0){
                throw new IllegalArgumentException(" the grade is suppose to be bigger than zero "+ grade);
            }else if(grade>100){
                throw new IllegalArgumentException("grade must be less than 100"+grade);
            }
            System.out.println("your grade is "+grade);

        }

    }

