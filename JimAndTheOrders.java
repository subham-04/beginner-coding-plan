
class Result {

    /*
     * Complete the 'jimOrders' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts 2D_INTEGER_ARRAY orders as parameter.
     */

    public static List<Integer> jimOrders(List<List<Integer>> orders) {
    // Write your code here
        TreeMap<Integer,Set<Integer>> map = new TreeMap<>();
        int customer=1;
        
        for(List <Integer> list:orders){
            int totalTime =0;
            for(int val:list){
                totalTime+=val;
            }
            
            if(map.containsKey(totalTime)){
                Set<Integer> hset = map.get(totalTime);
                hset.add(customer);
                map.put(totalTime,hset);
                
            }else{
                Set<Integer> hset = new TreeSet<>();
                hset.add(customer);
                map.put(totalTime,hset);
            }
            
            customer++;
        }
        
        List<Integer> result = new ArrayList<>();
        for(Integer key: map.keySet()){
            for(Integer val:map.get(key)){
                result.add(val);
            }
        }
        
        return result;
    }

}
