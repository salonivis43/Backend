class Methodsignature{
    void greet(){
        System.out.println("hello !");
    }
    void greetAgain(String str){
        System.out.println(str);
    }
    String greetOnceAgain(String str){
        return "Hello "+str;
    }

}
class Mainclass{
    public static void main(String args[]){
        Methodsignature ms=new Methodsignature();
        ms.greet();
        String msg=ms.greetOnceAgain("Welcome ");
        System.out.println(msg);
        ms.greetAgain("India");
    }
}
