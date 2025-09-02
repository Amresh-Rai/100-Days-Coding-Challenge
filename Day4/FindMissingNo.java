package Day4;

public class FindMissingNo {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,7,8,9,10};
        int n=10;

        int ExpectedSum= n*(n+1)/2;

        int ActualSum=0;

        for(int i=0;i<arr.length;i++){
           ActualSum=ActualSum +arr[i];
        }

        int MissingNumber=ExpectedSum-ActualSum;

        System.out.println("The Missing Number In The Sequense Is:"+ MissingNumber );

    }
    
}
