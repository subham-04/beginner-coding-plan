
public class Solution {

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
         int max=-1;
         
         for(int i=0; i<keyboards.length; i++){
             for(int j=0; j<drives.length; j++){
                 int price=keyboards[i]+drives[j];
                 if(max<price && price<=b){
                     max=price;
                 }
             }
         }
         
         
         return max;

    }
