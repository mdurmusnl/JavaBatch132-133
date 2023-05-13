package JavaPrcatice.day29repeat;
 // remember custom exception can be both runtime and compile time
// not lets make this exception as compile time exception  by exteding Exception class
//the following custom exception class has its own constructor but we shall create parameter const
public class IllegalGradeExcepton extends Exception{
     public IllegalGradeExcepton(String message){
      super(message);   // i can print a mesaage og parent class by using super()
     }

}
