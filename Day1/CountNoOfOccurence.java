package Day1;
public class CountNoOfOccurence {
    static void CounttheOccurence(int []arr,int n,int target){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                count=count+1;
            }
            
        }
        System.out.println(+ count);
    }
    
    public static void main(String[] args) {
        int []arr={1,1,2,2,2,2,3};
         int n=arr.length;
        int target=2;

        CounttheOccurence(arr,n,target);



    }
}
