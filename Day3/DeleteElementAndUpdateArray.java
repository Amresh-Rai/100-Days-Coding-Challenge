package Day3;

public class DeleteElementAndUpdateArray {

    public static int deleteElement(int[] arr, int n, int key) {
        int pos = -1;

        // Find position of element to delete
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                pos = i;
                break;
            }
        }

        // If element not found
        if (pos == -1) {
            return n;
        }

        // Shift elements to left
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        return n - 1; // new size
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        int key = 30;

        System.out.println("Original Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        n = deleteElement(arr, n, key);

        System.out.println("\nArray after deleting " + key + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
