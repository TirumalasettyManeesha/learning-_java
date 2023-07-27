import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int n = num;
        int rev = 0;
        int last;

        while (n > 0) {
            last = n % 10;
            rev = rev + (int) Math.pow(last, 3);
            n = n / 10;
        }

        if (num == rev) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
