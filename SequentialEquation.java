
class Result {

    /*
     * Complete the 'permutationEquation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY p as parameter.
     */

    public static List<Integer> permutationEquation(List<Integer> p) {
    // Write your code here
    ArrayList<Integer> list = new ArrayList<>();
    int x=1,y=0;
    while(x<=p.size()){
        for(int i=0; i<p.size(); i++){
            if(p.get(i)==x){
                for(int j=0; j<p.size(); j++){
                    if(p.get(j)==(i+1)){
                        y=j+1;
                        break;
                    }
                }
                list.add(y);
                y=0;
                x++;
                break;
            }
        }
    }
        return list;
    }

}
