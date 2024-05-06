import java.util.*;

public class TwoDarray{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        int[][] num= new int[rows][cols];

        for(int i=0;i<= rows;i++){
            for(int j=1;j<=cols;j++){
                num[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
        for(int i=0;i<= rows;i++){
            for(int j=1;j<=cols;j++){
                if(num[i][j]==x){
                    System.out.println("x found at location ("+ i +" ,"+j+")" );
                }
            }
            
        }



        
        // for(int i=0;i<= rows;i++){
        //     for(int j=1;j<=cols;j++){
        //         System.out.println(num[i][j]+" ");
        //     }
            
        // }

    }
}