package Array;
public class maxaveragesubarray{
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int max=sum;
        for(int i=k;i<nums.length;i++){
            sum=sum-nums[i-k]+nums[i];
            if(sum>max){
                max=sum;
            }
        }
        return (double)max/k;
    }
    public static void main(String[] args) {
        maxaveragesubarray sol = new maxaveragesubarray();

        // Example input
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        // Call the method
        double result = sol.findMaxAverage(nums, k);

        // Print the result
        System.out.println("Maximum Average Subarray: " + result);
    }
}