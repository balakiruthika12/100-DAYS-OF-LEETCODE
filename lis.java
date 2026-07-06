public class lis {
     public static void main(String[] args) {
	    int arr[]={3,10,2,1,20,0};
	    int n=arr.length;
	    int max=Integer.MIN_VALUE;
	    int dp[]=new int[n];
	    int i,j;
	    for(i=0;i<n;i++)
	    dp[i]=1;
	    for(i=0;i<n;i++)
	    {
	        for(j=0;j<i;j++)
	        {
	            if(arr[j]<arr[i])
	            dp[i]=(dp[i]>dp[j])?dp[i]:dp[j]+1;
	        }
	       max=Math.max(max,dp[i]);
	    }
	    System.out.println(max);
	}
}
