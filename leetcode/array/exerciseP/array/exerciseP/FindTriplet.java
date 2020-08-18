package array.exerciseP;

public class FindTriplet {

    void countAndPrintTripletes3Loop(int[] ints){

        int countTriplets = 0;
        for (int i=0;i<ints.length;i++){

            for (int j=i+1;j<ints.length;j++){
                int k = j;
                if(k<ints.length-1) {
                   //  != ints.length - 1 ? j : j - 1;

                    if (ints[i] + ints[k] == ints[k + 1]) {

                        System.out.println(" fount triplet :" + ints[i] + " ," + ints[k] + ", " + ints[k + 1]);
                    }

                }
            }

        }

    }

    public static void main(String[] args) {
        FindTriplet findTriplet = new FindTriplet();
        int[] input = {1,2,3,4,5,7};
        int[] input2 = {6,2,3,7};
        System.out.println("hello pranav rem correct thought gives u power ");
        findTriplet.countAndPrintTripletes3Loop(input);
        findTriplet.countAndPrintTripletes1Loop(input);
        //solutions 1. add two element using two loop and check/search if sum is already present (another loop or use map search containskey)
        //sol 2: if u sort it then its predectible and in one loop you can find it using two pointers
    }

    private void countAndPrintTripletes1Loop(int[] input) {
       //use two pointer for sorted arrays
    }

}