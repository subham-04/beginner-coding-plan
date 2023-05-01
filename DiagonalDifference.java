
class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    
    int fst_d=0;
    int sec_d=0;
    int diff=0;
    
    
    for(int i=0, j=0; i<arr.size(); i++, j++){
         fst_d+=arr.get(i).get(j);
        
    }
    
    for(int q=0, k=arr.size()-1; q<arr.size(); q++,k--){
         sec_d+=arr.get(q).get(k);
    }
    
    
    diff=Math.abs(fst_d-sec_d);
    
    return diff;
    }

}


// learnt how to access a 2d array in list  by using arr.get(i).get(j);
// How to get the diagonal elements (i=0, j=0 to i++,j++) and (i=0,j=n-1 to i=n-1,j=0)
// Also learnt How to use absolute value Math.abs()