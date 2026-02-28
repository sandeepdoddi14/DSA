package dsa.pointers.slidingWindow;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring1("au"));
    }

    public int lengthOfLongestSubstring(String s) {
        int p1=0;
        int p2=0;
        int maxLength=0;
        StringBuffer subString = new StringBuffer() ;
        while (p2<s.length())
        {
            if(!subString.toString().contains(s.charAt(p2)+""))
            {
                subString = subString.append(s.charAt(p2));
                maxLength = Math.max(maxLength,p2-p1+1);
                p2= p2+1;
            }
            else {
                subString.deleteCharAt(0); // shrink from left
                p1++;   // move left pointer
            }
        }
        return  maxLength;
    }


    public static int lengthOfLongestSubstring1(String s) {
        if(s.length()==1)
            return 1;
      int p1=0;
      int p2=0;
      int maxLength= 0 ;
      StringBuffer stringBuffer= new StringBuffer();
      while(p2<s.length())
      {
            if(stringBuffer.toString().contains(s.charAt(p2)+""))
            {
                maxLength = Math.max(maxLength,stringBuffer.length());
                stringBuffer = new StringBuffer(s.charAt(p2)+"");

            }
            else {
                stringBuffer.append(s.charAt(p2));
                maxLength = maxLength = Math.max(maxLength,stringBuffer.length());

            }
            p2 = p2+1;
      }
      return  maxLength;
    }

}
