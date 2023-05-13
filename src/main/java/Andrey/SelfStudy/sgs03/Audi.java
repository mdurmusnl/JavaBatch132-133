package Andrey.SelfStudy.sgs03;

public class Audi extends Car{
    public void ecoEngine(){
        System.out.println("audi (METHOD) engine always work eco peacefull ");
    }
    public void comfort(){
        System.out.println("Auid (METHOD) always produce comfortable cars");
    }
    public Audi(){
        System.out.println("Audi default const");
    }
    public Audi(int year){
        super("luxury");
        System.out.println("audi parameter const");
    }
}
