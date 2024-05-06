interface I{
    String str1="Hiiii";
    String str2="Hello";
    void showStr1();
    void showStr2();
    
}
class child implements I{
    public void showStr1(){
        System.out.println(str1);
    }
    public void showStr2(){
        System.out.println(str2);
    }
}
class mainclass{
    public static void main(String args[]){
        child in  =new child();
        in.showStr2();
        in.showStr1();
    }
}
