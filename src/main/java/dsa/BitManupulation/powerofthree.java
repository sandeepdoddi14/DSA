package dsa.BitManupulation;

public class powerofthree {

    //use recursion
    //bit wise only works with 2
    public boolean isPowerOfThree(int n) {
        if(n<=0)
            return false;
        if(n==1)
            return true;
        int power = 3;
        while(power<n && power < 1162261467)
        {
            power = power * 3;

        }
        return power == n;

    }

}
