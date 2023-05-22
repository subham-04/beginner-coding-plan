
class Result {

    /*
     * Complete the 'runningTime' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int runningTime(List<Integer> arr) {
    // Write your code here
    int count  =0;
    for(int i=0; i<arr.size()-1; i++){
        int j=i;
        while(j>=0 && arr.get(j)>arr.get(j+1)){
            int num=arr.get(j);
            arr.set(j,arr.get(j+1));
            arr.set(j+1, num);
            count++;
            j--;
        }
    }
    return count;
    }

}
