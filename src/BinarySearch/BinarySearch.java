package BinarySearch;

import java.util.Scanner;

// Used for sorted array
public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        System.out.println("Enter the target element");

        int target = input.nextInt();
//        System.out.println(BinarySearch(arr, 0, 9, target));
        System.out.println(ItrBinarySearch(arr, target));
    }

    // ***Code for only Ascending order, for descending order, the logic will reverse *** //
  static int BinarySearch(int[] array, int start, int end, int t) {
        int mid = (start + end)/2;
        if (array[mid]==t){
            return mid;
        } else if (array[mid] < t) {
            return (BinarySearch(array, mid+1, end, t));

        } else if (array[mid] > t) {
            return (BinarySearch(array, start, mid-1, t));
        } else if (start > end) {
            System.out.println("Element not found");
            return -1;
        }
        return -1;
  }

  // *** Iterative approach is better because it reduces function-call overhead. Recursion tends to create a stack frame for each step which consumes additional memory.
  static int ItrBinarySearch(int array[], int t) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end){
            int mid = start + ((end - start)/2);
            if (array[mid] < t) {
                start = mid+1;
            } else if (array[mid] > t) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
  }
}
