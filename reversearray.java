import java.util.Scanner;

public class reversearray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        
        for(int a=0;a<n;a++){
            arr[a]=sc.nextInt();
        }
        int i =0;
        int j= n-1;

        while (i<j) {
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        
            
        }
        for(int k=0;k<n;k++){
           System.out.println(arr[k]+" "); 
        }

    }
}
