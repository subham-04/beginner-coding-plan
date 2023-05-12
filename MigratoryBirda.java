class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
            int[] array =  new int[arr.size()];
            Arrays.fill(array,0);
        for(Integer i: arr){
            array[i]=array[i]+1;
        }
        
        int max = 0;
        int maxIndex=0;
        for(int i=0; i<array.length;i++){
            if(array[i]>max){
                max=array[i];
                maxIndex=i;
            }
        }
        
        return maxIndex;
    }

}
