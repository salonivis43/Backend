interface I{
    String strI="Hello from I";
    void showStrI();
}
class C{
    String strC="Hello from C";
    void showC(){
        System.out.println(strC);
    }
}
class child extends C implements I{
    public void showStrI(){
        System.out.println(strI);
    }
}
class mainclass{
    public static void main(String args[]){
        child in  =new child();
        in.showStrI();
        in.showC();
    }
}