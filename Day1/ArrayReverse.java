package Day1;

import java.util.Scanner;
public class ArrayReverse {
    static void ReverseArray(int []arr,int n){
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    } 

    static void PrintArray(int []arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(+ arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        
        int n;
        System.out.print("Enter the no.of Element In the Array:");
        n=in.nextInt();
        int []arr= new int[n];
        System.out.println("Enter the element in the Array:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.print("THe Original Array:");
        PrintArray(arr,n);

        System.out.println(" ");

        ReverseArray(arr,n);

        System.out.print("The Reversed Array is :");
        PrintArray(arr,n);
    }
}
