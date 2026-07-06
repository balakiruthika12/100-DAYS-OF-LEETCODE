import java.util.HashMap;

public class countelementwithmaxfreq { 
    public int maxFrequencyElements(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find maximum frequency
        int maxFreq = 0;
        for (int freq : map.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        // Sum all frequencies equal to maximum frequency
        int answer = 0;
        for (int freq : map.values()) {
            if (freq == maxFreq) {
                answer += freq;
            }
        }

        return answer;
    }
}
    

