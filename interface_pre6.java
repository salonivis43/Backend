interface I{
    String strI="Hello from I";
    void showStrI();
}
interface J{
    String strJ="Hello from J";
    void showStrJ();
}
class C{
    String strc="Hello from C";
    void showc(){
        System.out.println(strc);
    }
}
class child extends C implements I,J{
    public void showStrI(){
        System.out.println(strI);
    }
    public void showStrJ(){
        System.out.println(strJ);
    }
}
class mainclass{
    public static void main(String args[]){
        child in  =new child();
        in.showStrI();
        in.showStrJ();
        in.showc();
    }
}