class Result {

    /*
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */
     public static int reverse(int num){
         int reversed =0;
         while(num!=0){
             reversed= reversed*10 + num%10;
             num=num/10;
         }
         
         return reversed;
     }

    public static int beautifulDays(int i, int j, int k) {
    // Write your code here
    int count_beautiful_day=0;
    for(int start=i; start<=j; start++){
        int diff=start-reverse(start);
        if(diff%k==0) count_beautiful_day++;
    }
        return count_beautiful_day;
    }

}
