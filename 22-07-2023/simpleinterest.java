import java.util.Scanner;
class simpleinterest{
    public static void main(String[] args){
        double p,t,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principal amount:");
        p=sc.nextDouble();
        System.out.println("enter time in months:");
        t=sc.nextDouble();
        System.out.println("enter interest rate:");
        r=sc.nextDouble();

        double mul=p*t*r;
        double val=mul/100;
        System.out.println("simple interest"+val);
        double total=p+val;
        System.out.println("total amount:"+total);
    }
}