package BinarySearch;

// Used for sorted array
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 36;
        System.out.println(BinarySearch(arr, 0, 9, target));
    }

  static int BinarySearch(int[] array, int start, int end, int t) {
        int mid = (start + end)/2;
        if (array[mid]==t){
            return mid;
        } else if (array[mid] < t) {
            return (BinarySearch(array, mid+1, end, t));

        } else if (array[mid] > t) {
            return (BinarySearch(array, start, mid-1, t));
        }
        else{
            return -1;
        }
  }
}
