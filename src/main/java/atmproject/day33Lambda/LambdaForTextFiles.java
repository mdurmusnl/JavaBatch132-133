package atmproject.day33Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class LambdaForTextFiles {
    public static void main(String[] args) throws IOException {
        // how to oaccess a text file and print the text
        Files.lines(Paths.get("src/main/java/day33Lambda/MyTextFile.txt")).  //it find the textfile   gives a stream so all stream methods are available like sort , filter,map
                forEach(System.out::println);  //prints every line in the textfile
// convert all characters in the text file to uppercase then print the text on the console
        Files.lines(Paths.get("src/main/java/day33Lambda/MyTextFile.txt")).  //it accesses the textfile
                map(String::toUpperCase).  //converts into uppercase
                forEach(System.out::println); // and prints
//check if the text file has word "Java" in it
        boolean r1=Files.lines(Paths.get("src/main/java/day33Lambda/MyTextFile.txt")).anyMatch(t->t.contains("Java"));
        System.out.println(r1);

//print distinct words on the console in the file
        System.out.println("distinct words");
        Files.lines(Paths.get("src/main/java/day33Lambda/MyTextFile.txt")).   //this gives us lines of words  in a stream  but we need a stream wrods by words
                map(t->t.split(" ")).  //put each line into a inner- stream from  top to bottom  but we should break inner stream and get words
                flatMap(Arrays::stream).   ///breaks inner streams then will we have just words in the outer stream  anddd remember split method returns Array
                distinct().forEach(System.out::println);
      //get the words which ends with "s" and print them on the console
      Files.
              lines(Paths.get("src/main/java/day33Lambda/MyTextFile.txt")).  //gives lines of stream
              map(t->t.split(" ")).   //this method makes each lines an inner strream
              flatMap(Arrays::stream).  //this mehod breaks the inner stream and gives us words of an Array
              filter(t->t.endsWith("s")).   //filter seach those ends with "s"
              forEach(System.out::println);
//get the words DISTINCTLY ,convert them to lower case and print them on the console in reverse order
        Files.lines(Paths.get("src/main/java/day33Lambda/MyTextFile.txt")).
                map(t->t.split(" ")).   //put each word in to inner stream
                flatMap(Arrays::stream).    //breaks inner stream gives words in a stream
                map(t->t.replaceAll("[^a-zA-Z]","")).   //REMOVES ALL CHARACTERS DIFFERENT FROM LETTERS
                map(t->t.toLowerCase()).
                sorted(Comparator.reverseOrder()).
                forEach(System.out::println);
        // Find the total numbrr of letters used in the text file
   int r3=     Files.lines(Paths.get("src/main/java/day33Lambda/MyTextFile.txt")).
                map(t->t.split(" ")).  //puts each words into inner streams
                flatMap(Arrays::stream).  //breaks inner streams and makes a stream of words from top to buttom
                 map(t->t.replaceAll("[^a-zA-Z]","")).   //removers all characters difderent from letters
                map(t->t.length()).
                reduce(Math::addExact).
                get();

      accessAndPrinTheText("src/main/java/day33Lambda/MyTextFile.txt");
    }
public static void accessAndPrinTheText(String adress){

    try {
        Files.lines(Paths.get(adress)).  //it find the textfile   gives a stream so all stream methods are available like sort , filter,map
                forEach(System.out::println);  //prints every line in the textfile
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

}

}
