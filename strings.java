import java .util.*;
public class strings{
    private static Object out;

    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);

      String name=sc.nextLine();
      System.out.println("your name is : "+ name);

      //Concatenation'
      String firstname="Saloni";
      String lastname="Vishwakarma";
      String fullName=firstname+" "+lastname;
      System.out.println(fullName);
      System.out.println(fullName.length());

      //chart
      for(int i=0;i<fullName.length();i++){
        System.out.println(fullName.charAt(i));

      

      //Compare
      // String firstname="Saloni";
      // String lastname="Saloni";
      if(firstname.compareTo(lastname)==0){
        System.out.println("Strings are equls");

      }else{
        System.out.println("Strings aur not equls");
      }

    }
    
    }
}