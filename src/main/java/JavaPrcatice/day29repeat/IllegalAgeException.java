package JavaPrcatice.day29repeat;
  // lets make this our own exception as RuntimeException
public class IllegalAgeException extends RuntimeException {  // now our own exception class is child class of RuntimeException,
                                                          //since IllegalAgeException is a child class then it is able to use the features of parent class
                                                          // create a constructor
      public IllegalAgeException(String message){   //we put a message inside paranthesis to print the message of our ouw exception
   super(message);  // this calls the message of parent class contstructor
      }
      //lets create obe another constructor
      public IllegalAgeException(){
          // super();  optional to type  but it exist  and calls parent class non parameter constructor
      }

}
