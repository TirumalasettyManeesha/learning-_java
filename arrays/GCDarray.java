import java.util.Arrays;
import java.util.Scanner;
class GCDarray{
    public static void main(String[] args){
        int[] a={10,15,5};
        int i,j;
        int res=a[0];
        for(i=1;i<a.length;i++){
            res=findhcf(res,a[i]);
            }
            System.out.println(res);
            
        }
        
       

    
    public static int findhcf(int num1,int num2){
        while(num1!=num2){
            if(num1>num2)
                num1=num1-num2;
            else
                num2=num2-num1;
                
        }
        return num1;
    }
}