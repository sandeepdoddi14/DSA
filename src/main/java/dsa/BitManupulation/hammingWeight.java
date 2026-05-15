package dsa.BitManupulation;

public class hammingWeight {
    public static void main(String[] args) {
    System.out.println(hammingWeight(2));
    }
    public static int hammingWeight(int n) {
        int count=0;
        int mask=1;
        for(int i=0;i<32;i++)
        {
           if((mask &n)!=0)
           {
               count++;
           }
           mask=mask<<1;
        }
        return count;
    }
}
