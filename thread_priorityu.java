
class score extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("score cycle : "+i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception ex){

            }
        }
    }
}
class sound extends Thread{          //run, start(),join () ,yield(),sleep(),wait()
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("sound cycle : "+i);
        }
    }
}
class Mainclass{
    public static void main(String[] args) throws InterruptedException{
        
        score sc=new score();
        sound so =new sound();

        sc.start();
        so.join();
        sc.start();

        System.out.println(Thread.currentThread().getPriority());

        //priority of thread
        so.setPriority(Thread.MIN_PRIORITY);
        sc.setPriority(Thread.MAX_PRIORITY);

        so.setPriority(Thread.NORM_PRIORITY - 3);
        sc.setPriority(Thread.NORM_PRIORITY +1);


        System.out.println(so.getPriority());
        System.out.println(sc.getPriority());
        

        sc.setName("Renamed - Score Thread !");
        so.setName("Renamed - souns Thread !");
        System.out.println(sc.getName());
        System.out.println(so.getName());

    }
}