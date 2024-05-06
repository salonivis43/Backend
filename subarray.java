import java.util.Scanner;

public class subarray {
        public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        
        for(int a=0;a<n;a++){
            arr[a]=sc.nextInt();
        }
        //  int si =0;
          int ei = 0;
          for (int si=0;si<n; si++){
             for(ei=0;ei<n;ei++){
              for(int k=si;k<=ei;k++){
                System . out.println(arr[k]+" ");
              }
              System.out.println(
                
              );
             }
          }

    }
    
}
