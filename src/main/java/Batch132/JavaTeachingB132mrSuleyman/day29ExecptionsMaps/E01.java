package Batch132.JavaTeachingB132mrSuleyman.day29ExecptionsMaps;

public class E01 {
    /*
    what are the differences between throw and throws key word ***
      1)  throw is used inside the method body
          throws is used in the method sigaiture line
      2)  throw can be used multiple times in a method body
          throws can be used once in the method signature line
      3)  after " throw" we create an Exception object
          after " throws" we type just the name of the Exception
      4)  after " throw "  u can throw just a single exception
          after " throws " u can throw multiple  Exception
      5)  "throw" can be used just to throw "Run Time Exception" (unchecked Exceptions)   like AritmeticException
           "throws" can be used to throw both "Run Time Exception" or " CompileTime Exceptions(compiletime exception)

           19feb2023   we will learn how to create our own Exceptions
       1) Java created its own exception classes for common issues like dividing by zero, using nonexisting index etc...
          as a developer we may need our own strict rules in our app
          to create our own strict rules in our app ,we create our own Exception Classes
          our own exception classes are called  " Custom Exception Classes "
       2) " Custom Exception Classes " can be both  i) Run Time Exception ii) CompileTime Execption
               to create Custom Run Time Exception , you must extend to "Runtime Exception class"
                to create Custom Compile Time Exception , you must extend to "Exception class"
                Every Exception Class should have Exception word at the end
     */
    public static void main(String[] args) {

    }
}
