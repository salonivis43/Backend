import java.util.Scanner;
class student{
    int roll;
    String name;
    static String collage;
    void setNameRoll(){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your mame& roll no");
        name= sc.nextLine();
        roll=sc.nextInt();

    }
    void getNameRoll(){
        System.out.println("Name :"+name+"\n"+"roll :"+roll);

    }
    
    static void setCollage(){
        collage="BIT";
    }
    static void getCollage(){
        System.out.println("Colage :"+collage);

    }
}
class Mainclass{
    public static void main(String args[]){
        student.setCollage();
        student s1=new student();
        student s2=new student();                                        
        s1.setNameRoll();
        s2.setNameRoll();
        System.out.println("Detail");
        s1.getNameRoll();
        student.getCollage();
        s2.getNameRoll();
        student.getCollage();
    }
}