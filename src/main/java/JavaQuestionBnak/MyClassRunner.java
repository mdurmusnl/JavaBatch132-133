package JavaQuestionBnak;

public class MyClassRunner {
    public static void main(String[] args) {
        InfA obj=new MyClass();
        System.out.println(obj.myMethod());//returns 5

        MyClass mc=new MyClass();
        System.out.println("fffff");
        System.out.println(mc.y);//9
        System.out.println(mc.myMethod());//5
        System.out.println();
    }
}
