package Day2;

public class FindKthMinValue {
    static void SortArray(int []arr,int n){
       // for(int i=1;i<n;i++)
       int i=1;
       while(i<n){
           if(arr[i]<arr[i-1]){
            int temp=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=temp;
                i--;
                if(i==0)i=1;

           }
           else{
            i++;
           }

        }
    }

    static void PrintArray(int []arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(+ arr[i]);
        }
    }
    public static void main(String[] args) {
        int []arr ={7,4,8,3,6,5,2,2,1};
         
        int n= arr.length;
         System.out.print("The Original Array is :");
         PrintArray(arr,n);

         System.out.println(" ");

         SortArray(arr,n);

         System.out.print("THe Sorted Array:");
         PrintArray(arr,n);

         System.out.println("");

         int k = 3;   // maan lo hum 3rd minimum dhoondhna chahte hain
            if(k <= n) {
            System.out.println("\nThe " + k + "th minimum element is: " + arr[k-1]);
              } else {
              System.out.println("\nInvalid k (greater than array size)");
        }

    }

    
}
