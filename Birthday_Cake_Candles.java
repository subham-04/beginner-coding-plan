class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
        Collections.sort(candles);
        int count = 0;
        int max = candles.get(candles.size()-1);
        for(int i=candles.size()-1; i>=0; i--){
            if(candles.get(i)==max)count++;
        }
        return count;
    }

}
