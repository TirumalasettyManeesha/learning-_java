/*compare by using == when they assigns by a single referce like arr1={12,10} then arr2=arr1
 * use Arrays.equals(arr1,arr2) to compare the content of the arrays
 * for multidimesional arrays we use Arrays.deepEquals(arr1,arr2)
 */
import java.util.Arrays;
import java.util.Scanner;
class comparearrays{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        
        
        System.out.print("enter first array elements");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }System.out.print("enter first array2 elements");
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        
        if(Arrays.equals(arr1, arr2)){
            System.out.println("both arrays are equal");}
        
        else{
            System.out.println("arrays are not equal");
        }
        
        
        
    } 
}