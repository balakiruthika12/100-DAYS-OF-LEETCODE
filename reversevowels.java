package Array;

public class reversevowels {
    public String reverseVowels(String s)
    {   
        char []arr=s.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            while(left<right && !isVowel(arr[left]))
            {
                left++;
            }
            while(left<right && !isVowel(arr[right]))
            {
                right--;
            }
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
    }
    private boolean isVowel(char ch)
    {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
    public static void main(String[] args) {
        // Oru object create panrom
        reversevowels obj = new reversevowels();
        
        // Sample input kuduthu check panrom
        String input = "IceCreAm";
        String result = obj.reverseVowels(input);
        
        // Output-ah terminal-la print panrom
        System.out.println("Original String: " + input);
        System.out.println("Reversed Vowels: " + result);
    }
}
    
    

