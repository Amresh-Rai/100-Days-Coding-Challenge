package Day3;
//import java.util.Arrays;

public class SortZerosAndOnes {
    static void SortArray(int []arr,int n){
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=1){
               arr[j]=arr[i];
               j++;
            }
        }

            while(j<n){
                arr[j]=1;
                j++;
            }
        }

        static void PrintArrays(int []arr,int n){
            for(int i=0;i<n;i++){
                System.out.print(+ arr[i]);
            }
             
            

           }
        
    

    public static void main(String[] args) {
        int []arr={0,1,0,0,0,1,1,1,1,0};
        int n= arr.length;

        SortArray(arr,n);

        PrintArrays(arr,n);
    }
    
}
