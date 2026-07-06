import java.util.Arrays;
import java.util.Scanner;

public class movezeroes {
     public static void main(String[]args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=obj.nextInt();
        }

        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j++;
            }
        }
        System.out.print(Arrays.toString(nums));
    }
}
