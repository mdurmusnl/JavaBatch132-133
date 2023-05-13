package Batch132.JavaTeachingB132mrSuleyman.day29ExecptionsMaps;
    // custom compile time exception
public class IllegalGradeException extends Exception{    //we will create  pur own compile time error
    public IllegalGradeException(String message){
        super(message);      // we will use contstutor of parent
    }
    public IllegalGradeException(){  //THIS IS DEFAULT CONTS 19FEB 00:51:21
        super();
    }
}
