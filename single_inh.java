class Parent{
    void showParent(){
        System.out.println("Hello From Parent");
    }
}
class Child extends Parent{
    void ShowChild(){
        System.out.println("Hello From Child");
    }
}
class mainclass{
    public static void main(String args[]){
        Child re = new Child();
        re.ShowChild();
        re.showParent();
    }
}