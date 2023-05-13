package JavaPrcatice.JavaPractice09feb2023;

public class Q05Pyramid {
    public static void main(String[] args) {
        createPyramid(5);
    }
    /*
            *
           * *
          * * *
         * * * *
        * * * * *
     */
    public static void createPyramid(int row){
        for(int i=0;i<row;i++){
            for(int space=5-i;space>1;space--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
