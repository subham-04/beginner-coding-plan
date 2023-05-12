
class Result {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
    // Write your code here
    
    int i=0;
    int count =0;
    int sum=0;
    int ways=0;
    
    while(i<s.size()){
        sum=sum+s.get(i);
        count++;
        
        if(count==m && sum==d){
            count--;
            sum=sum-s.get(i-count);
            ways++;
        }else if(count==m){
            count--;
            sum=sum-s.get(i-count);
        }
        
        i++;
    }
    
    return ways;

    }

}
