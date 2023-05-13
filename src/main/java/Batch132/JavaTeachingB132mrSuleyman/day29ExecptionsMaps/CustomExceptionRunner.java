package Batch132.JavaTeachingB132mrSuleyman.day29ExecptionsMaps;

public class CustomExceptionRunner {
    public static void main(String[] args) throws IllegalGradeException {
          //  printAge(-3);  //Exception in thread "main" day29ExecptionsMaps.IllegalAgeException: negative ages are not valid
         studentGrade(-23);
    }

    //ex1  create a method to print ages , the method will throw exception if the age is negativr
    public static void printAge(int age) {
if(age<0){
    throw new IllegalAgeException("negative ages are not valid");   // type insdie parantesis is optionl bcs we have two conts
}else{
    System.out.println("your age is " + age);
}
    }
    // ex2
    public static void studentGrade(int grade) throws IllegalGradeException {
        if(grade<0|| grade>100){
            throw new IllegalGradeException("such grade is not possible");
        }else{
            System.out.println("student grade is"+grade);
        }
    }

}
