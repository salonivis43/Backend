import java.nio.channels.AlreadyBoundException;

class Mainclass{
    public static void main(String args[]){
        int c=0, a=10,b[]={2,0,5};
        try{
            int d=b[0];
            try{
                c=a/d;
                c=b[3];
            }
            catch(ArithmeticException e){
                System.out.println("Division Error : "+e.getMessage());
            }
        }
        
        catch(AlreadyBoundException e){
            System.out.println("Array index error : "+e.getMessage());
        }
        catch(Exception e){
            System.out.println("Unknown error : "+e.getMessage());
        }
        
        System.out.println(c);
    }
}