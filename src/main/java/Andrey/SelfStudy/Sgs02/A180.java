package Andrey.SelfStudy.Sgs02;

public class A180 extends Mercedes {
    public void sport(){
        System.out.println("A180 moves fast");
    }

    public A180() {

        System.out.println("a10 construction is on ");
    }
    public A180 (boolean hybrid){
        super(2022);
        System.out.println("a180 is hybrid");
    }
}
