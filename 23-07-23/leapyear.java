import java.util.Scanner;
class leapyear{
    public static void main(String[] args){
        int year;
        System.out.println("enter a year:");
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();

        if(year%4==0){
            if(year%100==0){
                if(year%4==0){
                    System.out.println("leap year");
                }else{
                    System.out.println("not a leap year");
                }
            }else{
                System.out.println("leap year");
            }
        }else{
            System.out.println("not a leap year");
        }
            
    }
}