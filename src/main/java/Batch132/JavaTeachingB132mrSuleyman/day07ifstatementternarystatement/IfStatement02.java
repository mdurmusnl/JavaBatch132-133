package Batch132.JavaTeachingB132mrSuleyman.day07ifstatementternarystatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //Examaple 1   get users age
        //0-4 kid   5-12 kid  13-20 teenegar 21-30 adult  other age= undefined negative age= invlid age
        Scanner input= new Scanner(System.in);
        System.out.println("enter your age");
      byte age = input.nextByte();
 // 4 gibi bir yas girildiginde age<5 kod blogu calisacak ve java diger kodlara bakmayacak
 // java yukarda asagi dogryu soldan saga dogru okuyor kodlari
        if(age<0){
            System.out.println("invalid age");
        }else if(age<5){
            System.out.println("baby");
        }else if(age<13){
            System.out.println("kid");
        }else {
            System.out.println("undefined");
        }






    }
}
