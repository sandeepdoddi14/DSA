package dsa.pointers.slidingWindow;

public class FlippingZeros {

        public int maxOnes(int arr[], int k) {
        // code here
            int result=0;
            int flipCount=0;
            int p1=0;
            int p2=0;
            while(p2<arr.length)
            {
                if(arr[p2]==1)
                {
                    p2= p2+1;
                }
                if(arr[p2]==0)
                {
                    flipCount = flipCount+1;
                } 
                if(arr[p2]==0 && flipCount>k)
                {
                    p1=p1+1;
                    result=Math.max(result, p2-p1);
                    if(arr[p1]==0)
                    {
                        flipCount = flipCount-1;
                    }
                }


            }

            return result;
        }

        
    }
    
