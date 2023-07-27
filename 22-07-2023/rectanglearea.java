import java.util.Scanner;

public class rectanglearea {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        double area=length*breadth;
        System.out.println("rectangle area:"+area);

   }
}