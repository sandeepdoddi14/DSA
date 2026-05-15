package dsa.pointers.slidingWindow;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int maxLength = Integer.MIN_VALUE;
        int p1=0;
        int p2=0;
        while(p2<s.length())
        {
           if(stringBuilder.indexOf(s.charAt(p2)+"")!=-1)
           {
             stringBuilder.deleteCharAt(0);
             p1=p1+1; 
           }
           else
           {
            stringBuilder.append(s.charAt(p2)+"");
            maxLength = Math.max(maxLength, p2-p1+1);
             p2=p2+1;
           }
          

        }
        
        return maxLength;
    
    }


   
}
