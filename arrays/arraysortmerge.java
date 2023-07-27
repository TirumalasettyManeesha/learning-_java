import java.util.Arrays;
import java.util.Scanner;
class arraysmergesort{
    public static void main(String[] args){
        int[] a={10,20,30,60};
        int[] b={50,60,1,2,8,6};
        int i,j,temp;
        int[] c=new int[a.length+b.length];
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
       /*  Arrays.sort(c);
        System.out.println(Arrays.toString(c));*/
        for(i=0;i<c.length-1;i++){
            for(j=0;j<c.length-i-1;j++){
                if(c[j]>c[j+1]){
                    temp=c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;

                }
            }
        }

        System.out.println(Arrays.toString(c));

    }
}