import java.util.Arrays;
import java.util.Scanner;
public class containsduplicate{
    public static void main(String[]args)
    {
        Scanner ch=new Scanner(System.in);
        int n=ch.nextInt();
        int arr[]=new int[n];
        int a=arr.length;
        for(int i=0;i<n;i++)
        {
            arr[i]=ch.nextInt();
        }
        Arrays.sort(arr);
        for(int i=1;i<a;i++)
        {
            if(arr[i]==arr[i-1])
            {
                System.out.print("True");
                return;
            }
        }
        System.out.print("False");
    }
}