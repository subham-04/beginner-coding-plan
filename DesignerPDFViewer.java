class Result {

    /*
     * Complete the 'designerPdfViewer' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h
     *  2. STRING word
     */

    public static int designerPdfViewer(List<Integer> h, String word) {
    // Write your code here
    HashMap<Character,Integer> map = new HashMap<>();
    int i=0;
    for(char c='a'; c<='z'; c++){
        map.put(c, h.get(i));
        i++;
    }
    int max=0;
    for(int j=0; j<word.length(); j++){
        if(map.containsKey(word.charAt(j))){
            if(max<map.get(word.charAt(j))){
                max=map.get(word.charAt(j));
            }
            
        }
    }
    
    return max*word.length();

    }

}
