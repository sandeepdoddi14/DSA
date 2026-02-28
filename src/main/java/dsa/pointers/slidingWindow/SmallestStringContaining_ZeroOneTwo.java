package dsa.pointers.slidingWindow;

import java.util.Arrays;

public class SmallestStringContaining_ZeroOneTwo {
    public static void main(String[] args) {
        System.out.println(smallest("1210"));
    }
    public static int smallest(String s) {
        int result = Integer.MAX_VALUE;
        int[] freq = new int[3];
        int p1=0;
        int p2=0;
        while(p2<s.length())
        {
            if(s.charAt(p2) == '0')
                freq[0] = freq[0]+1;
            else if(s.charAt(p2) == '1')
                freq[1] = freq[1]+1;
            else if(s.charAt(p2) == '2')
                freq[2] = freq[2]+1;

            if(freq[0]>=1 && freq[1]>=1  && freq[2]>=1 )
            {
                result  = Math.min(p2-p1+1,result);
                freq[s.charAt(p1)-'0'] = freq[s.charAt(p1)-'0']-1;
                p1 = p1+1;

            }
            else {
                p2++;
            }
        }

        return result==Integer.MAX_VALUE?-1:result;
    }
}
