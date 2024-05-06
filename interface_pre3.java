interface I{
    String strI="Hello from I";
    void showstrI();
}
interface J extends I{
    String strJ="Hello from j";
    void showstrJ();
}
class child implements J{
    public void showstrI(){
        System.out.println(strI);
        
    }
    public void showstrJ(){
        System.out.println(strJ);
        
    }
}
class mainclass{
    public static void main(String args[]){
        child in  =new child();
        in.showstrI();
        in.showstrJ();
    }
}
