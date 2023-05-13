package JavaQuestionBnak;

public class Statickeyword {
    static int a=10;
    int b=10;

    public static void main(String[] args) {
        Statickeyword t1=new Statickeyword();
        Statickeyword t2=new Statickeyword();
        t1.a=a+2;
        System.out.println(a);//12
        System.out.println(t1.a); //12
        t2.a=a+3;
        System.out.println(a);//15
        System.out.println(t2.a);//15
        System.out.println("ex2");
        t1.b=12;
        t2.b=13;
        System.out.println(t1.b);
        System.out.println(t2.b);

    }
}
