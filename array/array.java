import java.util.Scanner;

public class array{
    public static void main(String args[]){
        // int[] marks= new int[3];
        // marks[0]=97
        // marks[1]=45;
        // marks[3]=98;

        // // System.out.println(marks[0]);

        // for (int i=0; i<3;i++) {
        //     System.out.println(marks[i]);
            
        // }

        // int num={34,56,23}
        // for (int i=0; i<3;i++) {
        //     System.out.println(marks[i]);
                
        //  }



        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int[] number= new int[size];
        for (int i=0; i<size;i++) {
           number[1]=sc.nextInt();
            }

            int x=sc.nextInt();
            
        for (int i=0; i<number.length;i++) {
          if(number[i]==x){
            System.out.println("the number is "+number[i]);
          }
            }

    }
}