interface MyInterface{
    String str = "Hello From my Interface";
    void showMyInterface();

}

class Myclass implements MyInterface{
    public void showMyInterface(){
    System.out.println(str);
    }
}
class mainclass{
    public static void main (String args[]){
        Myclass myclass=new Myclass();
        myclass.showMyInterface();
    }
}