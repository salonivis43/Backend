class Demo{
    static String str = "Hello";
}
class mainclass
{
    public static void main(String args[]){
       Demo d=new Demo();
        Demo.str = "Welcome";
        System.out.println(Demo.str);

    }
}