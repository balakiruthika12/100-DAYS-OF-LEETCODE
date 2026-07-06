import java.util.Arrays;
import java.util.Scanner;

public class majorityelement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int [] nums=new int [n];
        for(int i=0;i<n;i++){
            nums[i]=obj.nextInt();
        }
        majorityelement m=new majorityelement();
        int result=m.majorityElement(nums);
        System.out.print(result);
}
}
