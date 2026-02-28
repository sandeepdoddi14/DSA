package dsa;

import java.util.HashMap;

public class StringMatching {
    public static void main(String[] args) {
        String s="nrnrs";
        String p="*nn";
        System.out.println(hasMatch(s,p));

    }

    public static boolean hasMatch(String s, String p) {
        HashMap<Character,Integer> temp = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(temp.get(s.charAt(i))==null)
            {
                temp.put(s.charAt(i),1);
            }
            else
                temp.put(s.charAt(i),temp.get(s.charAt(i))+1);
        }

        for(int j=0;j<p.length();j++)
        {
            if(p.charAt(j)!='*')
            {
                if(temp.get(p.charAt(j))==null || temp.get(p.charAt(j))==0)
                    return false;
                else
                    temp.put(p.charAt(j),temp.get(p.charAt(j))-1);
            }
        }

        return true;

    }
}
