package Andrey.SelfStudy.Sgs02;

public class VehicleRunner {
    public static void main(String[] args) {
        CLA myCLA= new CLA();
        myCLA.multidemia();
        myCLA.move(); //grandparent method
        myCLA.price();  //grandparent method
        myCLA.ecoEngine();//parent method
        myCLA.comfrot();// parent method
        myCLA.toString(); //default method in object class    we can say grangrangran....parent
        A180 myA180= new A180(true);
    }
}
