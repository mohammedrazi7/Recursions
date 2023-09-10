import java.util.Scanner;

public class sumArray {
    public static int sum(int a[],int idx){
        if(idx==0)
            return a[idx];
        else {
            return a[idx]+sum(a,idx-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of elements: ");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int r = sum(a,n-1);
        System.out.println("Sum of elements of the array: "+r);
    }
}
