package array.exerciseP;

public class ContigiousSubArrMaxSum {

    public static void main(String[] args) {
        int[] input = {1,2,3,-2,5};

        maxSumSubArrCont(input);
    }

    private static void maxSumSubArrCont(int[] input) {

        int i=0;
        int maxSum = input[i];
        int currSum = input[i];
            for (int j=i+1;j<input.length;j++){
                 currSum = currSum+input[j];

              maxSum=  Math.max(currSum,maxSum);

            }
        System.out.println("max sum is:"+maxSum);

    }
}
