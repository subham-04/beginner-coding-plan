class Result {

    /*
     * Complete the 'missingNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER_ARRAY brr
     */

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
    // Write your code here
        List<Integer> array = new ArrayList<>();
        
       TreeMap<Integer,Integer> map1 = new TreeMap<>();
       TreeMap<Integer,Integer> map2 = new TreeMap<>();
    
        for(int i=0; i<arr.size(); i++){
            if(map1.containsKey(arr.get(i))){
                map1.put(arr.get(i), map1.get(arr.get(i))+1);
            }else{
                map1.put(arr.get(i), 1);
            }
        }
        
        for(int j=0; j<brr.size(); j++){
            if(map2.containsKey(brr.get(j))){
                map2.put(brr.get(j), map2.get(brr.get(j)) +1);
            }else{
                map2.put(brr.get(j), 1);
            }
        }
        
        for(Integer n: map2.keySet()){
            
            if(map1.containsKey(n)){
                
                if( map2.get(n) - map1.get(n) !=0 ){
                    array.add(n);
                }
            }else{
                array.add(n);
            }
        }
        
        Collections.sort(array);
        
        return array;
    }

}
