package Andrey.interview;

public class IllegalGradeException extends Exception {   //if u extend Exception then the exception is Compile time exception  ,
                                                                // If u extend RuntimeException then the exception is runtime

    public IllegalGradeException(String message){
        super(message);
    }
}
