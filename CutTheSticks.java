
class Result {

    /*
     * Complete the 'cutTheSticks' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> cutTheSticks(List<Integer> arr) {
    // Write your code here
        List<Integer> ans = new ArrayList<>();
        Collections.sort(arr);
        int min = arr.get(0);
        
        ans.add(arr.size());
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)>min){
                min=arr.get(i);
                ans.add(arr.size()-i);
            }
        }
        
        return ans;

    }

}