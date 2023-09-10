import java.util.Scanner;

public class sumOfDigits {
    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        } else{
            return n%10+sumDigits(n/10);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int result=sumDigits(n);
        System.out.println("Sum of digits : "+result);
    }
}
