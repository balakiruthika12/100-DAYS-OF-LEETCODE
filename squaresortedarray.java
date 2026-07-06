import java.util.Arrays;
import java.util.Scanner;

public class squaresortedarray {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i]; // square each element
        }
        Arrays.sort(nums); // sort again after squaring
        return nums;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array size
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call the solution method
        squaresortedarray sol = new squaresortedarray();
        int[] result = sol.sortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }
}
