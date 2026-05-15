package dsa.Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeftRotate {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println(rotateLeft(4,arr));
    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
        List<Integer> temp = new ArrayList<>();

        //
        for(int i=0;i<d;i++)
        {
            temp.add(arr.get(i));
        }

        for(int i=d;i<arr.size();i++)
        {
            arr.set(i-d, arr.get(i));
        }

        for(int i = 0; i < temp.size(); i++) {
             arr.set(arr.size() - d + i, temp.get(i));
        }



        return arr;
    }
}
