class GrandParent{
    void showGrandParent(){
        System.out.println("Hello From Grand- Parent");
    }
}

class Parent1 extends GrandParent{
    void showParent1(){
        System.out.println("Hello From Parent1");
    }
}
class Parent2 extends GrandParent{
    void showParent2(){
        System.out.println("Hello From Parent2");
    }
}
class Child extends Parent1{
    void ShowChild(){
        System.out.println("hell from child");
    }
}
class mainclass{
    public static void main(String args[]){
        Child re = new Child();
        re.ShowChild();
        re.showParent1();
        re.showGrandParent();
        Parent2 he = new Parent2();
        he.showParent2();
        he.showGrandParent();    }
}