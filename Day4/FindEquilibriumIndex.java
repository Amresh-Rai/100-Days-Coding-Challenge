package Day4;

public class FindEquilibriumIndex {
    public static void main(String[] args) {
      //  int []arr={1,2,3,4,5};
        int []arr={1,3,5,2,2};
         int totalsum=0;
         for(int i=0;i<arr.length;i++){
            totalsum+=arr[i];

         }

         int leftsum=0;
         boolean found= false;
         for(int i=0;i<arr.length;i++){
            int rightsum = totalsum-leftsum-arr[i];

            if(leftsum == rightsum){
                System.out.println("The Index is :"+ i);
                found=true;
                  break;
            }
            leftsum+=arr[i];
        }
           if(!found){
           System.out.println("The Index not Found");
        
        }
    }
    
}
