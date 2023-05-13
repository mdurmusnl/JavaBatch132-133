package Batch132.JavaTeachingB132mrSuleyman.day28Exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class E04 {
    /*
         1) FileNotFoundException and IOException are compile time error
         2) FileNotFoundException is related with "file path" and " file existance"
         3) IOException is related with all input and output exception
         4) IOException is parent of FileNotFoundException  , if u use IOExecption thne do not use FileNotFoundexeception
         if you use both then make sure child is upper

     */
    public static void main(String[] args) throws IOException {
        readTextFile();
    }
//ex1  create a method to read a text file
    public static void readTextFile() throws IOException {

            FileInputStream fis=new FileInputStream("src/main/java/day28Exceptions/MyText");  //adress inside the paranthes
       int k=0;
       //fis.read method takes ascii value of J of java os OOP   the first sentence in the MyText
        //ascii value of J 74  THEN assign into k =72
       while((k=fis.read())!=-1){ //filenotfoundexception can not handle about reading issues but IOException handles all issues          // -1 means no charachter    it will keep printing untill no charahter
           System.out.print((char) k);    //read() method reads charachter by charachter
       }
    }
}

