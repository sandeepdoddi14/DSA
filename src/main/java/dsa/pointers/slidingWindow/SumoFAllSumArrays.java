package dsa.pointers;

public class SumoFAllSumArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subarraySum(arr));
    }

    public static int subarraySum(int[] arr) {
        // code here
        int sum = 0;
        for(int p1=0;p1<arr.length;p1++)
        {
            int currentSum=0;
            for(int p2=p1;p2<arr.length;p2++)
            {
                 currentSum = currentSum+arr[p2];
                  sum = sum + currentSum;
            }
           
        }
        return sum;
    }
}
