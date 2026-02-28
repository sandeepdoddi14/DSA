package dsa.pointers.slidingWindow;

public class FlippingZeros {
    public static void main(String[] args) {
        int[] arr={1,0,0,1,1,0,1,0,1,1,1};
        System.out.print(maxOnes(arr,2));

    }

    public static int maxOnes(int arr[], int k) {
        int p1=0;
        int p2=0;
        int rsult = Integer.MIN_VALUE;
        int count=0;
        int flip = 0;
        while(p2<arr.length)
        {
            if(arr[p2]==0)
                {
                    flip = flip+1;
                }
            
            while(flip>k)
            {
                
                if(arr[p1]==0)
                    flip = flip-1;
                p1 = p1+1;
            }
            rsult = Math.max(rsult, p2-p1+1);
            
                p2=p2+1;
        }
        return rsult;
    }


    
}
