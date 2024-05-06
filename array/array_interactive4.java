package array;
import java.util.Scanner;
class ArrayDemo {
    public static void main(String args[]){

       
       String days[]=new String[7];
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the days");
       days[0]=sc.nextLine();
       days[1]=sc.nextLine();
       days[2]=sc.nextLine();
days[3]=sc.nextLine();
days[4]=sc.nextLine();
days[5]=sc.nextLine();
days[6]=sc.nextLine();
System.out.println(" Days");
for(int i=0;i<=6;i++){
    System.out.println(days[i]);
}

    }
}