package JavaQuestionBnak;

import java.util.Arrays;

public class mdArrays01 {
    public static void main(String[] args) {
      //ex1    note : ex1 concern a method out of main method called  m()
        int [][]x={{2,1},{1,7,1}};
        System.out.println(m(x[1]));   //x[1] ={1,7,1}
        //ex2
        int [][]q={{1,2},{3,4,5}};
        int sum=3;
        for(int [] w:q){
            for(int k:w){
               sum+=k;
            }
        }
        System.out.println("the sum is  "+sum);
        //ex4
        int arr[][]={{3,2,1},{1,2,3}};
        System.out.println(arr.length);//2
        System.out.println(arr[0].length); //3
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
                if(arr[i][j]%2==1){
                   arr[i][j]+=1;
                }
                if(arr[i][j]%2==0){
                    arr[i][j]*=2;
                }
            }
        }
        System.out.println("aloo  "+Arrays.deepToString(arr));


    }
    public static int m (int []m ){
        int result =0;
        for(int i=0;i<m.length;i++){
            result +=m[i];  //  1+7+1=9
        }
        return result;
    }
}
