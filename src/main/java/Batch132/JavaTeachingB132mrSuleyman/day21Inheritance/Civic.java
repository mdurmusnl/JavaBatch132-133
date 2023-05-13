package Batch132.JavaTeachingB132mrSuleyman.day21Inheritance;

public class Civic extends Honda{
    public void ecoSystem(){
        System.out.println("using civic is not expensive");
    }

    public Civic() {
        super();
        //super(2021);  //it runs one upper class conts whics has parameter
    //  this is possible    super();  // optional    if u type or not it exist in here     must be at the fist line  mustttttt
        System.out.println("civic constructor");
    }
    public Civic(boolean hybrid){
        super(2021);
        System.out.println("civic constructor with boolean parameter");
    }
}
