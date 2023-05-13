
class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */
    public static boolean checkFactor(List<Integer> a, List<Integer> b , int num){
    
        for(int val:a){
            if(num%val!=0) return false;
        }
        
        for(int val:b){
            if(val%num!=0) return false;
        }
        
        return true;
    }
    
    
    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
        int count =0;
        Collections.sort(a);
        Collections.sort(b);
        int lastElementOfA=a.get(a.size()-1);
        int lastElementOfB=b.get(b.size()-1);
        for(int i=lastElementOfA; i<=lastElementOfB; i++){
            if(checkFactor(a, b, i)) count++;
        }
        
        return count;
    }

}
