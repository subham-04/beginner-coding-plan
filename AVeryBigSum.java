class Result {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
    // Write your code here
        Long sum = (long)0;
        for(int i=0; i<ar.size(); i++){
            sum+=ar.get(i);
        }
        return sum;
    }

}


// learnt Long cant be used just by writing "Long sum = 0" we've to define its type also
// like this "Long sum = (long)0;"