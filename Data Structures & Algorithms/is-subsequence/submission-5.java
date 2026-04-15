class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        if(s.isEmpty()){
            return true;
        } else if (t.isEmpty()){
            return false;
        }
        for (int i = 0; i < t.length(); i++){
            if(j >= s.length()){
                break;
            }
            if(s.charAt(j) == t.charAt(i)){
                j++;
            } 
        }
    
        return j==s.length();
    }
}