package LinearSearch;

public class Search2DArrays {
    public static void main(String[] args) {
        int arr[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 8;
        System.out.println(search2D(arr, target));
    }
    static int[] search2D(int[][] array, int target){
       int[] pos = new int[0];
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                if(target == array[row][col]){
                    pos = new int[]{row, col};
                }
            }
        }
        return pos;
    }
}
