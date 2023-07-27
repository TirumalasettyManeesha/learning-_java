import java.util.Arrays;
import java.util.Scanner;
class secondmaxarray{
    public static void main(String[] args){
        int[] a={3,610,20,30,60,80};
        int fmax=a[0];
        int smax=a[0];
        for(int i=0;i<a.length;i++){
            if(fmax<a[i]){
                smax=fmax;
                fmax=a[i];
            }
            else{
                smax=a[i];
            }

        }
        System.out.println("second maximum element:"+smax);
       

    }
}