class Demo{
    String show(String name){
       return "Hello"+name;
    //    System.out.println(name);
    }

}
class Mainclass{
    public static void main(String args[]){
        Demo d= new Demo();
        String str=d.show("Saloni ");
        System.out.println(str);
    }
}