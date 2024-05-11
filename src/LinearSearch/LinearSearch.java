package learning;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter target element");
        int target = input.nextInt();
        ;
        System.out.println(linearSearch(arr,target));

    }
    static int linearSearch(int array[], int target) {
        int index = -1;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == target) {
                index = i;
            }

        }
        return index;
    };
}
