class student{
    
   int h,e,p,c,m,total;
   float avg;
    void initData(){
     h=60;
        e=70;
        p=90;
        c=100;
        m=40;
    }
    void total(){
        total=h+e+p+c+m;

    }
    void avg(){
        avg=(total/5.0f);

    }
    void puttotal(){
        System.out.println(total);
    
        
    }
    void putavg(){
        System.out.println(avg);
    
        
    }
}
class Mainclass{
    public static void main(String args[]){
        student marks =new student();
        marks.initData();
        marks.total();
        marks.avg();
        marks.puttotal();
        marks.putavg();
    }
}