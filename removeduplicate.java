import java.util.Scanner;

public class removeduplicate {
    public int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
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
        removeduplicate sol = new removeduplicate();
        int k = sol.removeDuplicates(nums);

        // Print the number of unique elements
        System.out.println("Unique count: " + k);

        // Print the first k unique elements
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
