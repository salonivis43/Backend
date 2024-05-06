class Demo{
    public Object show;
    Demo(String name){
        System.out.println("hello from demo ");

    }
    void Show(){
        System.out.println("hello from show");
    }
}
class Mainclass{
    public static void main(String args[]){
        Demo d=new Demo("Saloni");
        d.Show();
    }
}