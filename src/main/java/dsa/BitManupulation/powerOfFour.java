package dsa.BitManupulation;

public class powerOfFour {
    public static void main(String[] args) {
        int n=16;
        System.out.println(isPowerOfFour(n));
    }

    //RECURSION SIMILAR TO 2
    public static boolean isPowerOfFour(int n) {
        if(n==1)
            return true;
        int p=4;
        while(p<n)
        {
            p = p*4;
        }
        return p==n;
    }


    public static boolean isPowerOfFour1(int n)
    {
        return n>0 && (n & (n-1))==0 && (n-1)%3==0;
    }
}
