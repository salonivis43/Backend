// class game{
//     void animation(){
//         for(int i=1;i<=5;i++){
//             System.out.println("Animation Executed for cycle :"+i);

//         }

//     }
//     void navigation(){
//         for(int i=1;i<=5;i++){
//             System.out.println("navigation Executed for cycle :"+i);
            
//         }

//     }
//      void score(){
//         for(int i=1;i<=5;i++){
//             System.out.println("score Executed for cycle :"+i);
            
//         }

//     }
//      void sound(){
//         for(int i=1;i<=5;i++){
//             System.out.println("sound Executed for cycle :"+i);
            
//         }

//     }
    
// }
// class Mainclass {
//     public static void main(String[] args){
//         game gm = new game();
//         gm.animation();
//         gm.navigation();
//         gm.score();
//         gm.sound();
//     }
// }
class animation extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("animation cycle : "+i);
        }
    }
}
class navigation extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("navigation cycle : "+i);
        }
    }
}
class score extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("score cycle : "+i);
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
        animation an = new animation();
        navigation na = new navigation();
        score sc=new score();
        sound so =new sound();

        an.start();
        na.start();
        sc.start();
        so.start();

    }
}