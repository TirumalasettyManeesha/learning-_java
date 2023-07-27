import java.util.Arrays;
import java.util.Scanner;
class arraysmerge{
    public static void main(String[] args){
        int[] a={10,20,30,60};
        int[] b={50,60,20,10};
        int i,j;
        int[] c=new int[a.length+b.length];
        /*for(i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(i=0,j=a.length;j<a.length+b.length;i++,j++){
            c[j]=b[i];
        }
        System.out.println(Arrays.toString(c));*/
        String[] s1={"java","c","c++"};
        String[] s2={"python","Ruby"};
        String[] s3=new String[s1.length+s2.length];
      
    
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        System.out.println(Arrays.toString(c));
        System.arraycopy(s1,0,s3,0,s1.length);
        System.arraycopy(s2,0,s3,s1.length,s2.length);
        System.out.println(Arrays.toString(s3));
        
        
        
    } 
}