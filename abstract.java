abstract class absclass{
    void show(){
        System.out.println("Hello");
    }
    abstract void greet();
}
class  Child extends absclass{
    void greet(){
        System.out.println("hello from child");
    }
}
class mainclass{
    public static void main(String args[]){
        Child C=new Child();
        C.show();
        C.greet();
    }
}