package Day1;
import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Enter the element in the array :");
        n=in.nextInt();
        int[]arr=new int [n];
        int d;
      
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        System.out.print("The Original Array is :" );
        PrintArray(arr,n);

        System.out.println(" ");

          System.out.print("Enter the position to Rotate An Array:");
          d=in.nextInt();

        RotateArray(arr,n,d);

        System.out.print("The Updated Array is :");
           PrintArray(arr,n);
        
    }

    static void RotateArray(int[]arr,int n,int d){
       for(int i=0;i<d;i++){
        int First=arr[0];
        for(int j=0;j<n-1;j++){
            arr[j]=arr[j+1];
        }
        arr[n-1]=First;
       }
    }

    static void PrintArray(int[]arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(+ arr[i]);
        }
    }
}
