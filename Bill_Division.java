class Result {

    /*
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill
     *  2. INTEGER k
     *  3. INTEGER b
     */

    public static void bonAppetit(List<Integer> bill, int k, int b) {
    // Write your code here
    int amount =0;
    for(int i=0; i<bill.size(); i++){
        if(i!=k) amount += bill.get(i);
    }
    amount = amount /2;
    if(amount >= b){
        System.out.println("Bon Appetit");
    }else{
        int diff = b-amount;
        System.out.println(diff);
    }

    }

}
