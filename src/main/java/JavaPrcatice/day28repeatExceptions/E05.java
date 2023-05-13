package JavaPrcatice.day28repeatExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E05 {
    public static void main(String[] args) throws IOException {
      //  readTextFile();
        readTextFile2();
    }
    public static void readTextFile(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/main/java/day28repeatExceptions/MyText.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void readTextFile2() throws IOException {
        FileInputStream fis2= new FileInputStream("src/main/java/day28repeatExceptions/MyText.txt");
        int k=0;
        while ((k=fis2.read())!=-1){
            System.out.print((char)k);
        }

    }
}
