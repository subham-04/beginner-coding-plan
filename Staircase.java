class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
        for(int i=0; i<n; i++){
            for(int j=n-i-1; j>0; j--){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("#");
            }
            System.out.println();
        }
    }

}
