import java.util.Scanner;

public class alternateSumSeries {
    public static int alternatesum(int n){
        if(n==0)
        {
            return 0;
        }
        else
        {
            if(n%2==0)
            {
                return alternatesum(n - 1) - n;
            }
            else
            {
                return alternatesum(n-1)+n;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int result=alternatesum(n);
        System.out.println("Alternate sum series: "+result);
    }
}
