package dsa.Arrays;

public class practice {
    public static void main(String[] args) {
        System.out.println("hello");
    }
    public static void leftRotate(int[] arr, int d) {
       int[] temp = new int[d];
       for(int i=0;i<d;i++)
       {
        temp[i] = arr[i];
       }
       for(int i=d;i<arr.length;i++)
        {
            arr[i-d] = arr[i]; 
        }
        for(int i=arr.length-d;i<arr.length;i++)
        {
            arr[i] = temp[d+i-arr.length];
        }
    }

}
