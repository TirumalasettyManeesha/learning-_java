import java.util.Scanner;
class hcf{
    public int hcf2(int n1,int n2){
        int hcf=0;
        int i=1;
        while(i<=n1&&i<=n2){
            if(n1%i==0&&n2%i==0)
                hcf=i;
                i++ ;
        }
        return hcf;

    }
    public static void main(String[] args){
      hcf obj=new hcf();
      int result=obj.hcf2(2,4);

       System.out.println("hcf:"+result);    
    }
}