package Andrey.SelfStudy.SsInterface;

public class Honda implements Ac,Engine {

    @Override
    public void cool() {
        System.out.println("ac works well");
    }

    @Override
    public void run() {
        System.out.println("run method works");
    }

    @Override
    public void MoveFast() {
        System.out.println("moveFast method works");
    }
}
