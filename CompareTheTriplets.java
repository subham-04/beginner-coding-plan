class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice_point=0;
        int bob_point =0;
        for(int i=0; i<a.size(); i++){
            if(a.get(i)>b.get(i)){
                alice_point++;
            }else if(b.get(i)>a.get(i)){
                bob_point++;
            }
        }
        
        List <Integer> result = new ArrayList<Integer>();
        result.add(alice_point);
        result.add(bob_point);
        
        return result;
    }

}


// learnt how to use add elements inside a list by using list.add(element) method to add the element in the list
// list.add(0, 2)  Adds 2 at index 0, shifting the previous element to index 1
// List<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 1, 4)); adding elements while intializing the list
