package Day1;
public class MoveZeros {
    static void MoveZeros(int[]arr,int n){
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        while(j<n){
            arr[j]=0;
            j++;
        }
    }

    static void PrintArray(int []arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(+ arr[i]);
        }
    }
   public static void main(String[] args) {
    int[]arr={1,0,2,0,3,0};
    int n= arr.length;

    System.out.print("The Original Array is :");
    PrintArray(arr,n);

    System.out.println(" ");

    MoveZeros(arr,n);

    System.out.print("The New Array is :");
    PrintArray(arr,n);

   }

    
}
