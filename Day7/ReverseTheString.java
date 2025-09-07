package Day7;

public class ReverseTheString {
    public static void main(String[] args) {
        String str = "Hello World";
        String reversed = reverse(str);
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }

    static String reverse(String str) {
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}
