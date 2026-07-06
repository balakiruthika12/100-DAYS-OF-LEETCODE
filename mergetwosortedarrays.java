import java.util.Arrays;
import java.util.Scanner;

public class mergetwosortedarrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Copy nums2 into the empty slots of nums1
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        // Sort the combined array
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read sizes
        int m = sc.nextInt();
        int n = sc.nextInt();

        // nums1 has length m+n
        int[] nums1 = new int[m + n];
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }
        // Fill remaining with 0 placeholders
        for (int i = m; i < m + n; i++) {
            nums1[i] = 0;
        }

        // nums2 has length n
        int[] nums2 = new int[n];
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        // Call merge
        mergetwosortedarrays sol = new mergetwosortedarrays();
        sol.merge(nums1, m, nums2, n);

        // Print merged array
        System.out.println(Arrays.toString(nums1));
    }
}
