interface I{
    String showStr();
    String showStr1();
    String showStr2(String S);
}
class child implements I{
    public String showStr(){
         return "Hello ";
    }
    public String showStr1(){

         return "hiii ";
    }
    public String showStr2(String S){
         return "Hey "+S;
    }
}
class mainclass{
    public static void main(String args[]){
        child c=new child();
        
        String msg=c.showStr2("Welcome ");
        System.out.println(msg);
        
         System.out.println(c.showStr());
         System.out.println(c.showStr1());
        
    }
}
