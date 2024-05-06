
// class animation extends Thread{
//     public void run(){
//         for(int i=1;i<=5;i++){
//             System.out.println("animation cycle : "+i);
//         }
//     }
// }
// class navigation extends Thread{
//     public void run(){
//         for(int i=1;i<=5;i++){
//             System.out.println("navigation cycle : "+i);
//         }
//     }
// }
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
    public static void main(String[] args){
        
        score sc=new score();
        sound so =new sound();

        // System.out.println(sc.getName());
        // System.out.println(so.getName());
        sc.start();
        so.start();


    }
}