package Array.twosum_1;

import java.util.*;

public class twosumIIsolution {

    public int[] twoSum(int[] numbers, int target) {

        int[] result = new int[2];
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                result[0] = left + 1;
                result[1] = right + 1;
                return result;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        twosumIIsolution sol = new twosumIIsolution();

        int[] ans = sol.twoSum(numbers, target);

        System.out.println(ans[0] + " " + ans[1]);

        sc.close();
    }
}