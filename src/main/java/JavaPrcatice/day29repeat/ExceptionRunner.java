package JavaPrcatice.day29repeat;

public class ExceptionRunner {
    public static void main(String[] args) throws IllegalGradeExcepton {
        checkAge(12);
        checkAge(-8);   // IllegalAgeException  Negative age is invalid
        System.out.println("hello");
        studentGrade(-3);
        System.out.println("bye");
    }

    // create a method the method throws exception if the age is negative
    public static void checkAge(int age) {
        try {
            if (age < 0) {    // if u want to throw an exception then u have to create an exception object with  " new " key word ==>  new IllegalAgeException()
                throw new IllegalAgeException("Negative age is invalid"); //i can throw my own message in 2 ways bcs i have 2 constructoe=r in my own exception class
            } else {
                System.out.println("your age is " + age);
            }
        } catch (IllegalAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    // ex2 cretae a method to print students grade, the method will throw exception if the student grade is negative or greaterthan 100
    public static void studentGrade(int grade) throws IllegalGradeExcepton {
       try{
        if(grade<0){
            throw new IllegalGradeExcepton("negative grade is invalid");
        }else if(grade>100){
            throw new IllegalGradeExcepton("grade bigger than 100 is invalid");
        }else{
            System.out.println(grade);
        }
        }catch (IllegalGradeExcepton e){
           System.out.println(e.getMessage());
       }
    }

}
