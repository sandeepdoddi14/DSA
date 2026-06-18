package dsa.Strings;

public class RansomNote {
    public static void main(String[] args) {
        String ranSomeNote ="a";
        String magaziine = "b";
        System.out.println(canConstruct(ranSomeNote,magaziine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        boolean result = true;
        int[] temp = new int[264];
        for(int i=0;i<magazine.length();i++)
        {
            temp[magazine.charAt(i)-'a'] = temp [magazine.charAt(i)-'a'] +1;
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            if(temp[ransomNote.charAt(i)-'a']==0)
                return false;
            else
                temp[ransomNote.charAt(i)-'a']=temp[ransomNote.charAt(i)-'a']-1;
        }

    

        return result;
        
    }
    
}
