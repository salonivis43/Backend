import java.util.Scanner;

class maxarray {
    public static void main(String[] args){
        int max=0;
        Scanner sc= new Scanner(System.in);
        int i= sc.nextInt();
        int j=sc.nextInt();
        int[][] arr= new int[i][j];

        for(int a=0;a<i;a++){
            for(int b=0;b<j;i++){
                arr[i][j]=sc.nextInt();

            }
            
        }
        for(int a=0;a<i;a++){
            for(int b=0;b<j;i++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }

            }
            
        }
        System.out.println(arr[i][j]);


    }
    
}
