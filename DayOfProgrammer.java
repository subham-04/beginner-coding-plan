
class Result {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
    // Write your code here
    int month[] = new int[]{31,28,31,30,31,30,31,31};
    int sum=0, programmersDay=256, diff=0;
    if(year==1918) return "26.09."+Integer.toString(year);
    
    if(year<=1917){
        if(year%4==0) month[1]=29;
    }
    
    if((year%400==0) || (year%4==0 && year%100!=0)) month[1]=29;
    
    for(int i:month) sum+=i;
    
    diff=programmersDay-sum;
    
    String s = Integer.toString(diff)+".09."+Integer.toString(year);
    
    return s;
    }

}
