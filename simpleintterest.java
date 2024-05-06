class Simpleinterest{
    int p,r,t;
    float si;
    void initData(){
        p=10;
        r=20;
        t=20;
    }
    void airthmatic(){
        si=(p*r*t)/100;

    }
    void putData(){
        System.out.println(si);
    }
}
class Mainclass{
    public static void main(String args[]){
        Simpleinterest SI=new Simpleinterest();
        SI.initData();
        SI.airthmatic();
        SI.putData();
    }
}