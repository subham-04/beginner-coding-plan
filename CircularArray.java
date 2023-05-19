
class Result {

    /*
     * Complete the 'circularArrayRotation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER k
     *  3. INTEGER_ARRAY queries
     */

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
    // Write your code here
        k=k%a.size();
        reverse(a, 0, a.size()-1);
        reverse(a, 0, k-1);
        reverse(a, k, a.size()-1);
        
        for(int i=0; i<queries.size(); i++){
            queries.set(i,a.get(queries.get(i)));
        }
        
        return queries;

    }

    public static void reverse(List<Integer> arr, int start, int end){
        while(start<end){
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
            
        }
    }

}
