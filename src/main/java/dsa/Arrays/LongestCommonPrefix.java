package dsa.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strgs={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strgs));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        StringBuffer result= new StringBuffer();
        int n1=strs[0].length();
        int n2=strs[1].length();
        for(int i=0;i<n1 && i<n2;i++)
        {
            if(strs[0].charAt(i)==strs[1].charAt(i))
            {
                  result = result.append(strs[0].charAt(i)); 
            }
            else
                break;

        }
        for(int i=2;i<strs.length;i++)
        {
            StringBuffer temp = result;
            result = new StringBuffer();
            for(int j=0;j<temp.length() && j<strs[i].length();j++)
            {
                if(strs[i].charAt(j)==temp.charAt(j))
                    {
                        result = result.append(strs[i].charAt(j)); 
                    }
                    else
                break;

            }
        }

        return result.toString();
    }
}
