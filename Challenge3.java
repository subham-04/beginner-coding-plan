
class Result {

    /*
     * Complete the 'insertionSort2' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort2(int n, List<Integer> arr) {
    // Write your code here
        
            for(int i=0; i<n-1; i++){
                int j=i;
                while(j>=0 && arr.get(j)>arr.get(j+1)){
                    int num = arr.get(j+1);
                    int leftNum = arr.get(j);
                    arr.set(j,num);
                    arr.set(j+1,leftNum);
                    j--;
                }
                
                for(int val:arr){
                    System.out.print(val+" ");
                }
                System.out.println();
            }

    }

}
