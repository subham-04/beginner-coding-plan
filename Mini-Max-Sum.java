
class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    Collections.sort(arr);
    long min=0, max=0;
    
    for(int i=0; i<4; i++){
        min+=arr.get(i);
    }
    
    for(int j=arr.size()-1; j>=arr.size()-4; j--){
        max+=arr.get(j);
    }

    System.out.println(min+" "+max);

    }

}