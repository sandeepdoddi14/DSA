package dsa.pointers.slidingWindow;

public class LongestSubStringWithoutRepeatingChar {
    public static void main(String[] args) {
        System.out.println(longestSubstring("konkjjnjmkpkjoo"));
    }
    public static int longestSubstring(String s)
    {
        int maxLenth=Integer.MIN_VALUE;
        StringBuffer subString = new StringBuffer();
        int p1=0;
        int p2=0;
        while (p2<s.length())
        {

            if(subString.indexOf(s.charAt(p2)+"")!=-1)
            {
                subString = new StringBuffer(subString.substring(1,subString.length()));
                p1 = p1+1;
            }
            else
            {
                subString = subString.append(s.charAt(p2));
                maxLenth = Math.max(maxLenth,p2-p1+1);
                p2 = p2+1;
            }
        }
        return  maxLenth;
    }
}
