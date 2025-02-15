import java.util.Arrays;

public class cop {
    public static int minOperations(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        // Find the maximum possible value
        int maxVal = 0;
        for (int i = n - 3; i >= 0; i--) {
            if (arr[i] + arr[i + 1] > arr[i + 2]) {
                maxVal = arr[i + 2];
                break;
            }
        }

        // Count the number of operations
        int operations = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < maxVal) {
                operations++;
                arr[i] = maxVal;
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,3};
        int operations = minOperations(arr);
        System.out.println("Minimum operations: " + operations);
    }
}