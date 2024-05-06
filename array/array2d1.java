class Mainclass{
    public static void main(String args[]){
        String days[][]= new String[2][3];
        days[0][0]="Monday";
        days[0][1]="Tuesday";
        days[0][2]="Wednesday";


        days[1][0]="Thursday";
        days[1][1]="Friday";
        days[1][2]="Saturday";


        // System.out.println(days[1][1]);

        for(int r=0;r<days.length;r++){
            for(int c=0;c<=2;c++){
                 System.out.print(days[r][c]+"\t\t");

            }
            System.out.println();
        }
        
    }
}