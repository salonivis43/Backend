class absclass{
    void show(){
        System.out.println("Hello");
    }
    
}
class  Child extends absclass{
    void show(){
        System.out.println("hello from child");
    }
}
class mainclass{
    public static void main(String args[]){
        Child C=new Child();
        C.show();
        C.show();
    }
}