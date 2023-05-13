package Andrey.SelfStudy.SsATMprojecttounderstanconstructors;

public class AtmRunner {
    public static void main(String[] args) {
        Atm atm1= new Atm();
       Account account1=new Account("mustafa","2344",2000);
       atm1.generate(account1);
        System.out.println("exit ");
    }
}
