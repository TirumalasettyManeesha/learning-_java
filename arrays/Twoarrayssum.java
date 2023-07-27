import java.util.arrays;
import java.util.Scanner;
class arraysum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        int y=sc.nextInt();
        int[] arr2=new int[n];
        if(n!=y){
            System.out.print("Both should have same length");
        }
        System.out.print("enter first array elements");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }System.out.print("enter first array2 elements");
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        

        
        int[] arr3=new int[n];
        for(int i=0;i<n;i++){
            arr3[i]=arr1[i]+arr2[i];
        }
        
        for(int i:arr3){
            System.out.print(i+" ");
        }
    }
}