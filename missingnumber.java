public class missingnumber {
    public static void main(String[]args)
    {//leet 268
        int arr[]={3,0,1};
        int n=arr.length;
        int temp=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==temp)
            {
                temp++;
            }
        }
        System.out.print(temp);
    }
    
}
