import java.util.Scanner;

class Login{
    String username,password;
    void getLoginDetails(){
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter the user name and password");
        username=sc.nextLine();
        password=sc.nextLine();

    }
    void verifyLoginDetails(){
        if("admin".equalsIgnoreCase(username)&&"admin".equalsIgnoreCase(password)){
            System.out.println("you are welcome  !");
        }
        else{
            try{
            throw new Exception("Invalid Credentials-----login Again");
            // System.out.println("Invalid Credentials-----login Again");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

    }
} 
class Mainclass{
    public static void main(String[] args){
         Login user= new Login();
         user.getLoginDetails();
         user.verifyLoginDetails();
    }
}