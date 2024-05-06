public class selectionsort {
    public static void main(String[] args) {

        int[] arr= {2,4,23,1,3,67,34};
         
    }
    public static void selectionsort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minval=arr[i];

            int minidx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<minval){
                    minval=arr[j];
                    minidx=1;
                }

            }
            int temp = arr[i];
             arr[i]=arr[minidx];
             arr[minidx]=temp;
        }
        for(int val:arr){
            System.out.println(val);
        }
        // for(int i=0;i<arr.length;i++){
        //     int val=arr[i];
        // }
    }
    
}
