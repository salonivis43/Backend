class Demo{
    void showOne(){
        System.out.println("hello from showone");
        showtwo();

    }
    void showtwo(){
        System.out.println("hello from showone");
        
    }
}
class Mainclass{
    public static void main(String args[]){
        Demo d=new Demo();
        d.showOne();
    }
}