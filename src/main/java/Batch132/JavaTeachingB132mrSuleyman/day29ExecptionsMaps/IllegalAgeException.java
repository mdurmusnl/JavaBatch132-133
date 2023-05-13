package Batch132.JavaTeachingB132mrSuleyman.day29ExecptionsMaps;
// thus is my own customized exception  then u must create a constructor,  its not must but create to be able to put a message
public class IllegalAgeException extends RuntimeException {
    public IllegalAgeException(String  message){  // i want to be able to print a message by this cont with the help of parent RuntimeException class

        super(message);
}    //constructor


public IllegalAgeException(){

        super();   // optional to type   without a message
}
}
