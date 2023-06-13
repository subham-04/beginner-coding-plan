class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        //event1
        int ehour = Integer.parseInt(event1[0].substring(0,2));
        int emin =  Integer.parseInt(event1[0].substring(3));
        int endhour =  Integer.parseInt(event1[1].substring(0,2));
        int endmin = Integer.parseInt(event1[1].substring(3));
        
        //event2
        int starthour = Integer.parseInt(event2[0].substring(0,2));
        int startmin =  Integer.parseInt(event2[0].substring(3));
        int eEndhour = Integer.parseInt(event2[1].substring(0,2));
        int eEndmin =  Integer.parseInt(event2[1].substring(3));
        
        //event 1 total time
        int estart = ehour*60 + emin;
        int end = endhour*60 + endmin;
        //event 2 total time
        int start = starthour*60 + startmin;
        int eend = eEndhour * 60 + eEndmin;
        
      if((estart<=start && start<=end) || (estart<=eend && eend<=end) || (start<=estart && estart<=eend) || (start<=end && end<=eend)){
          return true;
      }
        
        return false;
    }
}