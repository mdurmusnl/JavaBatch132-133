package Batch132.JavaTeachingB132mrSuleyman.day24Interface2022;

public class Honda implements Engine,Ac,Brake{
    @Override
    public void digital() {
        System.out.println("this is a digital AC");
    }

    @Override
    public void secureBrake() {
        System.out.println("this is a secure brake");
    }

    @Override
    public void ecoEngine() {
        System.out.println("this is an eco engine ");
    }

    @Override
    public void price() {

    }
}
