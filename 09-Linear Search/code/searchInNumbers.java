import java.util.Scanner;

public class searchInNumbers {
    public static void main(String[] args) {
    
        int[] nums = {77, 34, 3, 4, 5, 33, 35, 35, 5};
        int target = 4;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }

    static void 
}
