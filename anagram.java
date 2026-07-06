package Array;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
     public boolean isAnagram(String s, String t) {
        char [] a=s.toCharArray();
        char [] b=t.toCharArray();
        if(a.length!=b.length){
            return false;
        }
        else{
        Arrays.sort(a);
        Arrays.sort(b);
        }
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i])
                    return false;
            }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input strings
        System.out.println("Enter first string:");
        String s = sc.nextLine();

        System.out.println("Enter second string:");
        String t = sc.nextLine();

        anagram va = new anagram();
        boolean result = va.isAnagram(s, t);

        if(result) {
            System.out.println("Yes, it is an anagram!");
        } else {
            System.out.println("No, not an anagram.");
        }

        sc.close();
    }
    
}
