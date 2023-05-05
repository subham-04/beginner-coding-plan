class Result {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
    
        int orange_count =0, apple_count=0;
        
        for(int i=0; i<=apples.size()-1; i++){
            // int temp = apples.get(i) + a;
             apples.set(i,apples.get(i) + a);
            if(apples.get(i)>=s && apples.get(i)<=t) apple_count++;
        }
        
        for(int j=0; j<=oranges.size()-1; j++){
            // int temp = oranges.get(j) - b;
            oranges.set(j, b+oranges.get(j) );
            if(oranges.get(j)>=s && oranges.get(j)<=t) orange_count++;
        }
        System.out.println(apple_count+"\n"+orange_count);
    }

}