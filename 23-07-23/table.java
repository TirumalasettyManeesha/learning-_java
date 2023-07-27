import java.util.Scanner;
class table{
    public static void main(String[] args){
        int n;
        System.out.println("enter a number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=10;i++){
            int res=n*i;
            System.out.println(n+"*"+i+"="+res);
        }

            
    }
}