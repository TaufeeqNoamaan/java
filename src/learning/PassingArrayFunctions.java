package learning;

import java.util.Arrays;

public class PassingArrayFunctions {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr)); // Pass-by-value is default paramter passing method in java, there is no pass-by-reference
    }
    static void change(int[] arr) {
        arr[0] = 92;
    }
}
