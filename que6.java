import java.util.*;

public class Main {
    public static long trapRainWater(int[] arr, int n) {
        if (n == 0) return 0;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = arr[0];
        for (int i = 1; i < n; i++) left[i] = Math.max(left[i - 1], arr[i]);
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) right[i] = Math.max(right[i + 1], arr[i]);
        long water = 0;
        for (int i = 0; i < n; i++) water += Math.min(left[i], right[i]) - arr[i];
        return water;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(trapRainWater(arr, n));
    }
}
