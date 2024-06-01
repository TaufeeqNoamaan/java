package BinarySearch;

// ***  Order-Agnostic Binary Search helps to find the whether the given array is sorted in ascending order or descending order ***//
public class Order_Agnostic_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,5,8,10};
        Order_Agnostic(arr, 0, arr.length-1);
    }
    static void Order_Agnostic(int[] array, int start, int end) {
        if (start < end) {
            System.out.println("Array is sorted in Ascending order");
        }
        else {
            System.out.println("Array is sorted in Descending order");
        }
    }
}
