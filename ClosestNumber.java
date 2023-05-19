
class Result {

    /*
     * Complete the 'closestNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> closestNumbers(List<Integer> arr) {
    // Write your code here

        Collections.sort(arr);
        HashMap<Integer,Integer> map = new HashMap<>();
        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i<arr.size()-1; i++){
            int diff = arr.get(i+1)-arr.get(i);
            map.put(i, diff);
            minDiff=Math.min(minDiff, diff);
            
        }
        
        List<Integer> array = new ArrayList<>();
        
        for(Integer key: map.keySet()){
            if(map.get(key)==minDiff){
                array.add(arr.get(key));
                array.add(arr.get(key+1));
            }
        }
        
        return array;
    }

}
