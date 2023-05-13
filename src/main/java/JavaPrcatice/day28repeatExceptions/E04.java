package JavaPrcatice.day28repeatExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E04 {
    public static void main(String[] args) throws IOException {  // throws FileNotFoundException  this covers both exception   maybe file is not found maybe file path is correct but the file was removed
  // readTextFile();  //we handles the exception in the methow by try catch block
    readTextFile2(); // we didnt handle the exception  in the method  we just typed this method throws an exceptiongy7
                      // readTextFile2(); throwing a compile time exception and we didnt handle it  we must handle in here
    }
    //better handle the exception with try catch ok
    // create a method to read a text file
    public static void readTextFile(){                           ///mybe adress is wrong  maybe adress is ok but maybe the file has been deleted,or removed
        try {
            FileInputStream fis= new FileInputStream("src/main/java/day28repeatExceptions/MyText.txt"); //java suspect about 2 thins as an exception
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    //2nd way is throw exception in the method signature  throws FileNotFoundException
    // in the the following method, FileNotFoundException  can not handle reading isseu thrown by read() method  thats why we shall use IOException
    public static void readTextFile2() throws IOException {  // in this case if u call the method in the main method then u will get compile time erorr
        FileInputStream fis2= new FileInputStream("src/main/java/day28repeatExceptions/MyText.txt");
               int k=0;                   //UTF  is english character   thast why read() method gives compile time exception (IOException)
               while ((k=fis2.read())!=-1){    //read() method takes the byte value ascii value of each charachter
                   System.out.print((char) k);  //(char)k  is type casting  to get the charachrer back
               }
    }
}
