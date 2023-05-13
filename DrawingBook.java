
class Result {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
    // Write your code here
        int step=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<=n; i++){
            map.put(i,step);
            i++;
            if(i<=n)map.put(i,step);
            step++;
        }
        
        return Math.min(map.get(p),map.get(n) - map.get(p));
    }

}
