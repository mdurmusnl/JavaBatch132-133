package Andrey.SelfStudy.Ssoverriding;

public class Animal {
    public boolean claw=false;
    public int age=2;

    public   void eat (){
        System.out.println("cat eat in the way it prefer");
    }
 public Animal create(){
        return new Animal();
 }

  public Integer number(){
        return 2;
 }

}
