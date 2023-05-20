
class Result {

    /*
     * Complete the 'maximumToys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY prices
     *  2. INTEGER k
     */

    public static int maximumToys(List<Integer> prices, int k) {
    // Write your code here
        int count=0;
        
        Set<Integer> hset = new TreeSet<>();
        for(Integer i:prices){
            
                hset.add(i);
            
        }
        for(Integer price:hset){
            if(k>price){
                k=k-price;
                count++;
            }
        }
        return count;
    }

}
