package Batch132.JavaTeachingB132mrSuleyman.day21inheritanceandpolymorphismbatch2022;


public class Civic extends Honda {
    public static void ecoEngine(){
        System.out.println("civis has eco oil mode");
    }
    public Civic(){

        System.out.println("civic class contructor 1");
    }
    public Civic(int year){
        super(true);//  brand new   we call upper class method
        System.out.println(year);
    }
}
