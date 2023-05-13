package JavaPrcatice.JavaPrcatice15feb;

public class Q01 {
    //ex1 create aa method that prints numbers from 100 to 1 without using loops and numbers
    public static void main(String[] args) {
        int ch = 'd';  //ch=100
        System.out.println((char) 100);  // print  'd'   ucan easily find ascii value by this way
        System.out.println((int)'d');  //100
        printNumbers('d');
    }
  public static void printNumbers(char ch){
          if(ch>='a'/'a'){
              System.out.print((int)ch+" ");
              ch--;
              printNumbers(ch);   //  we call the method inside the method   that makes if statement work  like a loop
          }
  }
}