package dsa.BitManupulation;

public class poweroftwo {

    //bit wise
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n & (n-1))==0;
    }
}
