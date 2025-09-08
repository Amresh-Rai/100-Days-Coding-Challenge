package Day4;

public class MaximumSumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        int maxSum = findMaxSubarraySum(arr);
        System.out.println("Maximum Subarray Sum = " + maxSum);
    }

    static int findMaxSubarraySum(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // ya to current element se naya subarray start kare
            // ya previous sum ke sath continue kare
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // maxSum ko update karna
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
