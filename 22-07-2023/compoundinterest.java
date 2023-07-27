import java.util.Scanner;
class compondinterest{
    public static void main(String[] args){
        double p,n,t,r;
        Scanner sc=new Scanner(System.in);
        p=sc.nextDouble();
        n=sc.nextDouble();
        t=sc.nextDouble();
        r=sc.nextDouble();
        r=r/100;
        double total = p*Math.pow( 1+(r/n), n*t);
        double cinterest=total-p;
        System.out.println("total:"+total);
        System.out.println("cinterest:"+cinterest);
        
    }
}