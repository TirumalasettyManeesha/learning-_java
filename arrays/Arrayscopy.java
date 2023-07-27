/*shallow copy-this copy done by using directly "=" operator 
but when we change elements in parentarray it effects child array too
deepcopy-this copy done by using loops so changes 
made in parent array won't affect the child array  */

import java.util.Arrays;
import java.util.Scanner;
class arraycopy{
    public static void main(String[] args){
        
        int[] arr1={10,60,89,70};
        //1.shallow copy
        /*[int[] arr2=arr1;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        arr1[3]=500;
        arr1[1]=99;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));]*/
        
        //2.deepcopy
        /*int[] arr2=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        arr1[3]=500;
        arr1[1]=99;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));*/
       //3.System.arraycopy(src,index,des,index,length)
       int[] arr2=new int[arr1.length];
        System.arraycopy(arr1,0,arr2,0,arr1.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        //it appiles for 2D arrays also
        /*3.Arrays.copyOf(array,array.length); used to copy arrays*/
        int[] arr3=Arrays.copyOf(arr1,arr1.length);
        System.out.println(Arrays.toString(arr3));
        /*3.Arrays.copyOfRange(array,startindex,end index); used to copy arrays*/
        //4.arr.clone() used to copy array
        
        
    } 
}