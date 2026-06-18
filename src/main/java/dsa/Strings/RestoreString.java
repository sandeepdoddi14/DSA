package dsa.Strings;

public class RestoreString {

    public static void main(String[] args) {
        
    }

   public String restoreString(String s, int[] indices) {
        char[] countArray = new char[s.length()];
        StringBuilder stringBuilder = new StringBuilder();
        
        for(int i=0;i<s.length();i++)
        {
            countArray[indices[i]] = s.charAt(i);
        }

        for(int i=0;i<countArray.length;i++)
        {
            stringBuilder.append(countArray[i]);
        }

       return  stringBuilder.toString();
        
    }
    
}
