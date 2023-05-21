
class Result {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
    // Write your code here
            int key = arr.get(n-1);
            int j=n-2;
            while(j>=0 && arr.get(j)>key){
                int num = arr.get(j);
                arr.set(j+1,num);
                j--;
                
                for(int val:arr){
                    System.out.print(val+" ");
                }
                System.out.println();
            }
            
            arr.set(j+1,key);
            for(int val:arr){
                System.out.print(val+" ");
            }
    }

}
