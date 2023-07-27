import java.util.Scanner;

class trianglearea {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double height = sc.nextDouble();
        double breadth = sc.nextDouble();
        double area=0.5*breadth*height;
        System.out.println("triangle area:"+area);

   }
}