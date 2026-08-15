class Solution {
    public boolean isSubsequence(String s, String t) {
        if(substring(s,t)){
            return true;
        }else{
            return false;
        }

    }

    boolean substring(String s , String t){
        int n = s.length();
        int m = t.length();
        
        if(n == 0){
            return true;
        }
        if(m == 0 ){
            return false;
        }

        int i = 0 , j = 0;
        while(i < n && j < m){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == n;
    }
}