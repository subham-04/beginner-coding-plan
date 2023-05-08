class Result {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
    
    // if one kangaroos speed and position is greater than the other then they will never meet each other
    if((x1>x2 && v1>v2) || (x2>x1 && v2>v1)) return "NO";

 //So, we need to add an extra condition to check if the position of one kangaroo is less than the other and its speed is also less than or equal to the other kangaroo's speed, then return "NO".

    while(x1<=x2){
        // if their distance becomes equal then return yes
        if(x1==x2) {
            return "YES";
        }
        
        x1 = v1+x1;
        x2 = v2+x2;
        
        
    }
    return "NO";
    }

}
