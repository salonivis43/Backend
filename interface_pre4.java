interface  I{
    String StrI="hello from I";
    void showStrI();
}
interface  J{
    String StrJ="hello from J";
    void showStrJ();
}
class child implements I,J{
    public void showStrI(){
        System.out.println(StrI);
    }
    public void showStrJ(){
        System.out.println(StrJ);
    }
}
class mainclass{
    public static void main(String args[]){
        child in  =new child();
        in.showStrI();
        in.showStrJ();
    }
}