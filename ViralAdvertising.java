ex.*;

class Result {

    /*
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int viralAdvertising(int n) {
    // Write your code here
        int p_liked=0;
        int p_shared=0;
        int people=5;
        
        for(int i=1; i<=n; i++){
            p_shared=people/2;
            people= p_shared*3;
            p_liked=p_shared+p_liked;
            
        }
        
        return p_liked;
    }

}
