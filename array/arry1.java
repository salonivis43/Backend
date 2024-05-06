class ArrayDemo {
    public static void main(String args[]){
        // String days[]=new String[7];

// days[0]="Sunday";
// days[1]="monday";
// days[2]="Tuesday";
// days[3]="Wednesday";
// days[4]="Thursday";
// days[5]="Friday";
// days[6]="Saturday";
String days[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

//Getting the size of arr
int arrlen = days.length;
System.out.println(arrlen);
for(int i=0;i<=6;i++){
    System.out.println(days[i]);
}

    }
}