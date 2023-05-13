package practices02dt;

public class Q02ForLoop {
    public static void main(String[] args) {

        for(int i=13;i<212;i++){
            if(i%4==0 && i%6==0){
                System.out.print(i+" ");
            }
        }
//2nd way
        System.out.println();
        System.out.println("with while loop");
      int i=13;
        while(i<212){
            if(i%4==0 && i%6==0){
                System.out.print(i+" ");
            }
            i++;
        }
        System.out.println();

    }
}
