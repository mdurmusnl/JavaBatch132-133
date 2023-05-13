package Andrey.SelfStudy.sgs03;

public class A5 extends Audi{
    public void premiuim(){
        System.out.println("A5 is a high level luxurt sport perimium car");   // then method runs
    }

    public A5(){
        System.out.println("A5 DEFAULT const");   //first cont run
    }
    public A5(boolean hybrid){
        super(2023);
        System.out.println("A5 boolean conts");
    }
}
