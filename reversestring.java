package Array;
import java.util.*;
public class reversestring{
    public static void main(String[]args)
    {
        Scanner ch=new Scanner(System.in);
        String s=ch.nextLine();
        char[] arr=s.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println(new String(arr));
    }
}