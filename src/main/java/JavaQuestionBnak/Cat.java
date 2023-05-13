package JavaQuestionBnak;

public class Cat implements InfA,InfB{
    @Override
    public int myMethod() {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(InfB.weight);
    }
}
