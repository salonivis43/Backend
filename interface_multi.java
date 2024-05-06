class parent{
    void showParent(){
        System.out.println("Hello From parent");

    }
}
interface I{
    String str="Hiiii";
    void showI();
}
class child extends parent implements I{
    public void showI()
    {
        System.out.println(str);
    }

}
class mainclass{
public static void main (String args[]){
        child c=new child();
        c.showParent();
        c.showI();
    }
}