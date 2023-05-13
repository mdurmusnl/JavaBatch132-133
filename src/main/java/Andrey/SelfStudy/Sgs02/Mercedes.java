package Andrey.SelfStudy.Sgs02;

public class Mercedes extends Vehicle{
    public void  ecoEngine(){
        System.out.println("mercedes has eco engine ,peacefull with nature");
    }
    public void comfrot(){
        System.out.println("mercedes is a comfrotable car");
    }

    public Mercedes() {
        System.out.println("mercedes contruction is on");
    }
    public Mercedes(int year){
        super("SUV");  //go upper class (parent class) and implement the conts with parameter as "suv"
        System.out.println("mercedes construction is active");
    }
}
