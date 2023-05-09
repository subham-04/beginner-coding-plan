class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
        int min=0, max=0, min_count=0, max_count=0;
        int i=0;
        min=scores.get(i);
        max=scores.get(i);
        for( i=1; i<scores.size(); i++){
            
            if(min>scores.get(i)){
                min=scores.get(i);
                min_count++;
            } 
            else if(max<scores.get(i)){
                max=scores.get(i);
               max_count++; 
            } 
            
        }
        
        List<Integer> result = new ArrayList<>(Arrays.asList(max_count, min_count));
        
        return result;
        
    }
}
