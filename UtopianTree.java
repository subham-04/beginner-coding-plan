
class Result {

    /*
     * Complete the 'utopianTree' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int utopianTree(int n) {
    // Write your code here
        int flag=1;
        int height =1;
        int i=0;
        while(i<n){
            if(flag==1){
                //spring
                height=2*height;
                flag=-1;
            }else if(flag==-1){
                //summer
                height+=1;
                flag=1;
            }
            
            i++;
        }
        
        return height;
    }

}
