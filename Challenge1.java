
class Result {

    /*
     * Complete the 'introTutorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER V
     *  2. INTEGER_ARRAY arr
     */

    public static int introTutorial(int V, List<Integer> arr) {
    // Write your code here
        
        int high = arr.size()-1;
        int low = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr.get(mid)==V) return mid;
            
            if(arr.get(mid)>V){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        
        return 0;

    }

}

