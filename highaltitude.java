package Array;

public class highaltitude {
     public int largestAltitude(int[] gain) {
        int curr=0;
        int max=0;
        for(int i=0;i<gain.length;i++){
            curr+=gain[i];
            max=Math.max(max,curr);
        }
        return max;
    }
    public static void main(String[] args) {
        highaltitude sol = new highaltitude();

        // Example input
        int[] gain = {-5, 1, 5, 0, -7};

        // Call the method
        int result = sol.largestAltitude(gain);

        // Print the result
        System.out.println("Highest Altitude: " + result);
    }
    
}
