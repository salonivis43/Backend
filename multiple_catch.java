import java.nio.channels.AlreadyBoundException;

class Mainclass{
    public static void main(String args[]){
        int c=0, a=10;
        int[] b={2,0,5};
        try{
            c=a/b[0];
            String str=null;
            int i=str.charAt(0);

        }
        catch(ArithmeticException e){
            System.out.println("Division Error : "+e.getMessage());
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