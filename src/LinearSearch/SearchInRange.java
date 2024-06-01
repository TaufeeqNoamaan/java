package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int start_index = 1;
        int end_index = 6;
        int target = 3;
        System.out.println(searchInRange(arr, start_index, end_index, target));
    }
    static int searchInRange(int[] array, int start, int end, int target){
        int index = -1;
        if(array.length == 0) {
            return index;
        }
        for(int i = start; i <= array[end]; i++) {
            if(target == array[i]) {
                index = i;
            }
        }
        return index;
    }
}
