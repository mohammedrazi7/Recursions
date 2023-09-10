import java.util.Scanner;

public class max {
    public static int maxValue(int arr[], int n, int idx){
        if(idx == n - 1)
            return arr[n - 1];
        int maxOfLaterIndices = maxValue(arr, n,idx + 1);
        int maxVal = Math.max(arr[idx], maxOfLaterIndices);
        return maxVal;
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
        int r=maxValue(a,n,0);
        System.out.println("Maximum element: "+r);
    }
}
