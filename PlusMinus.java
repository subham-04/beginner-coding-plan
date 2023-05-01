class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        int i=0;
        int count_p=0, count_n=0, count_z=0;
        while(i<arr.size()){
            if(arr.get(i)>0){
                 count_p++;
                 i++;
                 }
            else if(arr.get(i)<0){
                 count_n++;
                 i++;
                 }
            else{
                 count_z++;
                 i++;
                }
        }
        
        double pos = (double)count_p/arr.size();
        double neg = (double)count_n/arr.size();
        double zero = (double)count_z/arr.size();
        System.out.println(pos);
        System.out.println(neg);
        System.out.println(zero);
    }

}

//Learnt that while diving to get a floating point number we always need to typecast it to float or double
// There are several methods to restrict the digits after decimal eg- System.out.format("Double Number: %.2f", num);  