import java.util.Scanner;
class lcm{
    public int lcm2(int n1,int n2){
        int smallest=(n1<n2)?n1:n2;
        int largest=(n1>n2)?n1:n2;
        int minmul=smallest;
        while(true){
            if(minmul%largest==0)
                return minmul;
             minmul = minmul + smallest ;
        }

    }
    public static void main(String[] args){
      lcm obj=new lcm();
      int result=obj.lcm2(5,9);

       System.out.println("lcm:"+result);    
    }
}