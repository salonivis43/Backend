
class GrandParent{
    void showGrandParent(){
        System.out.println("Hello From Grand- Parent");
    }
}
class Parent extends GrandParent{
    void showParent(){
        System.out.println("Hello From Parent");
    }
}
class Child extends Parent{
    void ShowChild(){
        System.out.println("Hello From child");
    }
}
class mainclass{
    public static void main(String args[]){
        Child re = new Child();
        re.ShowChild();
        re.showParent();
        re.showGrandParent();
    }
}