public class Solution {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        
        int diff_XZ = z-x;
        diff_XZ=Math.abs(diff_XZ);
        int diff_YZ = z-y;
        diff_YZ=Math.abs(diff_YZ);
        
        if(diff_XZ<diff_YZ){
            return "Cat A";
        }else if(diff_YZ<diff_XZ){
            return "Cat B";
        }
        
        return "Mouse C";
    }

}
