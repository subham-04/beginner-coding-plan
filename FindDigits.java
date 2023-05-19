
class Result {

    /*
     * Complete the 'findDigits' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int findDigits(int n) {
    // Write your code here
    int count =0;
    int actualNum=n;
    while(n>0){
        int num=n%10;
        n=n/10;
        if(num!=0 && actualNum%num==0) count++;
    }
    
    return count;
    }

}
