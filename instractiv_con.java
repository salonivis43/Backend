import java.util.Scanner;
class Student{
    String name;
    Student(String n){
        name = n;
    }
    Student(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the name ");
        name = sc.nextLine();
    }
    void showName(){
        System.out.println("Hello "+name);
    }
}
class Mainclass{
    public static void main(String[] args){
        Student std=new Student();
        std.showName();
    }
}