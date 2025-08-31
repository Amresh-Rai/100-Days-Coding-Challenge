// package Day1;
// public class secondlargest {
//     static void SecondLargest(int []arr,int n){
//          int MAX=arr[0];
//          int SMAX=arr[0];

//          for(int i=0;i<n;i++){
//             if(arr[i]>MAX){
//                 MAX=arr[i];
//             }
              
//          }
//          for(int i=0;i<n;i++){
//             if(arr[i]>SMAX && arr[i]!=MAX){
//                 SMAX=arr[i];
//             }
//          }
//          System.out.println("Second Maximum ELment In The Array is:"+SMAX);
//     }
//     static void PrintArray(int[]arr,int n){
//         for(int i=0;i<n;i++){
//             System.out.print(+arr[i]);
//         }
//     }
//     public static void main(String[] args) {
        

//     int []arr={1,2,3,4,5,6,7};
//     int n=arr.length;
//     System.out.print("The Original Array is :");
//      PrintArray(arr,n);
//      System.out.println("");

//      SecondLargest(arr,n);


    
// }
// }


//-----------------------------------------------------------------------------------


package Day1;

import java.util.Scanner;

public class secondlargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Second largest number doesn't exist.");
            return;
        }

        int[] arr = new int[n];

        
        System.out.print("Enter element at arr[0]: ");
        arr[0] = sc.nextInt();
        System.out.print("Enter element at arr[1]: ");
        arr[1] = sc.nextInt();

        int max, smax;

        if (arr[0] > arr[1]) {
            max = arr[0];
            smax = arr[1];
        } else {
            max = arr[1];
            smax = arr[0];
        }


        for (int i = 2; i < n; i++) {
            System.out.print("Enter element at arr[" + i + "]: ");
            arr[i] = sc.nextInt();

            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] < max) {
                smax = arr[i];
            }
        }

        if (smax == max) {
            System.out.println("There is no second max element in this array.");
        } else {
            System.out.println("The second largest element is: " + smax);
        }

        sc.close();
    }
}
