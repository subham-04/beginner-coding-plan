class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0; i<grades.size(); i++){
            int num = grades.get(i);
            int rem = num % 5;
            if(num >= 38 && rem>2){
                num = num - rem + 5;
                result.add(num);
            }else{
                result.add(num);
            }
        }
        
        return result;
    }

}