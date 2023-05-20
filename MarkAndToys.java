
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
        
        Collections.sort(prices);
        for(Integer price:prices){
            if(k>price){
                k=k-price;
                count++;
            }else{
                break;
            }
        }
        return count;
    }

}
