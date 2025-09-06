package Day7;

import java.util.Deque;
import java.util.stream.Gatherer.Integrator;

public class RemoveDuplicateFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,5};
        int k = removeDuplicates(arr);

        System.out.println("Unique count: " + k);
        System.out.print("After removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
