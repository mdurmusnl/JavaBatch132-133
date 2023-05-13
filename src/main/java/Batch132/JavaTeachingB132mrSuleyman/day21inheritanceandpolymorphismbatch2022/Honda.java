package Batch132.JavaTeachingB132mrSuleyman.day21inheritanceandpolymorphismbatch2022;



public class Honda extends Car {
    public static void hondaMake(){
        System.out.println("honda makes car strong");
    }
    public Honda(){

        System.out.println("honda class construtor 1");
    }
    public Honda(boolean isNew){
        super("Hybrid");// in car class it makes hybrind in the type of engine
   if(isNew){
       System.out.println("brand new");
   }else{
       System.out.println("used");
   }
    }
}
