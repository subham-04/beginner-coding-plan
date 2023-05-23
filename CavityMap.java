
class Result {

    /*
     * Complete the 'cavityMap' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static List<String> cavityMap(List<String> grid) {
    // Write your code here
        List<String> ans = new ArrayList<>();
        for(int i=0; i<grid.size(); i++){
            if(i==0 || i==grid.size()-1){
                ans.add(grid.get(i));
            }
            else{
                String s = grid.get(i);
                String str = "";
                for(int j=0; j<grid.size(); j++){
                    if(j==0 || j==grid.size()-1){
                        str=str+s.charAt(j);
                        
                    }
                    else{
                        int topElement = grid.get(i-1).charAt(j)-'0'; 
                        int bottomElement = grid.get(i+1).charAt(j)-'0'; 
                        int leftElement = s.charAt(j-1)-'0'; 
                        int rightElement = s.charAt(j+1)-'0';
                        int element = s.charAt(j)-'0';
                        
                        if(element>topElement && element>rightElement && element>leftElement && element>bottomElement){
                            str=str+'X';
                        }
                        else{
                            str=str+s.charAt(j);
                        }
                    }
                    
                }    
                
                ans.add(str);
            }
        }

        return ans;
    }

}
