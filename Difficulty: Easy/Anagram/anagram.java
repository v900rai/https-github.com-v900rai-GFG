

class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }

       char onechar [] =s1.toCharArray();
       char twochar [] =s2.toCharArray();
       
       Arrays.sort(onechar);
       Arrays.sort(twochar);
       
        return Arrays.equals(onechar, twochar);
        
    }
}