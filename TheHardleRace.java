
class Result {

    /*
     * Complete the 'hurdleRace' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY height
     */

    public static int hurdleRace(int k, List<Integer> height) {
    // Write your code here
        Collections.sort(height);
        int max=height.get(height.size()-1);
        if(k<max) return max-k;
        
        
        return 0;
    }

}
