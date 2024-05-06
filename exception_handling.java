class Mainclass{
    public static void main(String args[]){
        int c=0;
        try{
            c=10/0;

        }
        catch(ArithmeticException e){
            System.out.println("Division Error : "+e.getMessage());
        }
        System.out.println(c);
    }
}