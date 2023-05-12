
class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<ar.size(); i++){
            if(map.containsKey(ar.get(i))){
                map.put(ar.get(i),map.get(ar.get(i))+1);
            }else{
                map.put(ar.get(i),1);
            }
        }
        
        int count_pair=0;
        
        for(Integer j: map.keySet() ){
            count_pair= (map.get(j)/2) + count_pair;
            //here it divides the number of socks it has like 5/2 then 2 pairs
        }
        
        return count_pair;
    }

}
