import java.util.Scanner;
class reverse{
    public static void main(String[] args){
        int n;
        System.out.println("enter a number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        /*while(n!=0){
            int r=n%10;
            System.out.print(r);
            n=n/10;
        }*/
        int reverse=0;
        while(n!=0){
            int lastdigit=n%10;
            reverse=reverse*10+lastdigit;
            n=n/10;

        }
        System.out.println("reversed number"+reverse);

            
    }
}