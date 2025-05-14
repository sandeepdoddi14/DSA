package dsa;

import java.util.HashSet;
import java.util.Set;

public class Strings {
    /*
    dsa.Notes:
    ASCII Values
    a = 97
    A = 65
     */
    public static void main(String[] args) {
        String sequence = "ababc";
        String word = "ab";
        //System.out.println(maxRepeating(sequence, word));
       // System.out.println(longestNiceSubstring("dDzeE"));
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s,goal));
    }


    public static boolean rotateString(String s, String goal) {
       int rotations = 0;
       StringBuilder stringBuilder = new StringBuilder(s);
       while(rotations <s.length()) {
           char temp = stringBuilder.charAt(0);
           //for (int i = 0; i < s.length(); i++) {
               stringBuilder.replace(0, stringBuilder.length(), stringBuilder.substring(1,stringBuilder.length())+temp);
               if(stringBuilder.toString().equals(goal)) {
                   return true;
               }

           //}
           rotations++;
       }
       return false;
    }
    public static int maxRepeating(String sequence, String word) {
        int k = 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(word);

        while (sequence.contains(stringBuilder)) {
            k = k + 1;
            stringBuilder.append(word);
        }
        return k;
    }

    public static String longestNiceSubstring(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            if (!(set.contains(Character.toLowerCase(s.charAt(i))) && set.contains(Character.toUpperCase(s.charAt(i))))) {
                set.remove(s.charAt(i));
            }
        }

        if(set.isEmpty())
            return "";
        for (int i = 0; i < s.length(); i++) {
            if(!set.contains(s.charAt(i))){
                    String pre = longestNiceSubstring(s.substring(0,i));
                    String post = longestNiceSubstring(s.substring(i+1,s.length()));
                    return pre.length() >= post.length() ? pre : post;
            }
        }
        return s;
    }
}
