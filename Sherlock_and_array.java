
class Result {

    /*
     * Complete the 'balancedSums' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static String balancedSums(List<Integer> arr) {
    // Write your code here
    
    int sum =0;
    for(int i=0; i<arr.size(); i++) sum+=arr.get(i);
    
    int new_sum =0;
    for(int i=0; i<arr.size(); i++){
        new_sum+=arr.get(i);
        if(sum==new_sum) return "YES";
        sum-=arr.get(i);
    }
    
    return "NO";
    }
}
