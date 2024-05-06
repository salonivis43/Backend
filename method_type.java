class Demo{
    static void greet(){
        System.out.println("greeting from my side ");



    }
    void show(){
        System.out.println("hey i am demo");
    }

}
class Mainclass{
    public static void main(String args[]){
        Demo d= new Demo();
        Demo.greet();
        d.show();
    }
}