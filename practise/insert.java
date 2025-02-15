import java.util.Arrays;
import java.util.Scanner;

public class insert {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            System.out.println(Arrays.toString(insertion_sorting(arr)));
        }
    }
    public static int[] insertion_sorting(int[] A){
        int n = A.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j>0; j--) {
                if (A[j]<A[j-1]){
                    int temp = A[j];
                    A[j]=A[j-1];
                    A[j-1]=temp; 
                }
                else{
                    break;
                }
            }
        }
        return A;
    }
}