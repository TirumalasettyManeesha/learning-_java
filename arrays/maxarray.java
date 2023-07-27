import java.util.Arrays;
import java.util.Scanner;
class maxarray{
    public static void main(String[] args){
        int[] a={3,610,20,30,60,80};
        int max=a[0];
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
            if(min>a[i]){
                min=a[i];
            }

        }
        System.out.println("maximum element:"+max);
        System.out.println("minimum element:"+min);

    }
}