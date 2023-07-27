import java.lang.arrays;
class arraylength{
    public static void main(String[] args){
        int[] arr={1,5,6,7,8};
        int l=arr.length;
        double sum=0;
        double avg;
        System.out.println("array length:"+l);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
        for(int i:arr){
            System.out.print(i+" ");
            sum=sum+i;
        }System.out.println("sum:"+sum);
        avg=sum/arr.length;
        System.out.println("Average:"+avg);
    }
}