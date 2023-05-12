
class Result {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    // Write your code here
        int pair_count =0;
        for(int i=0; i<ar.size(); i++){
            for(int j=i+1; j<ar.size(); j++){
                int pair=ar.get(i)+ar.get(j);
                if(pair%k==0) pair_count++;
            }
        }
        
        
        return pair_count;
        
    }

}
