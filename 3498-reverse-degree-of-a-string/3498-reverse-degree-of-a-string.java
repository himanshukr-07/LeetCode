class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        // int digit = (int)(Math.log10(s));
        for(int i = 0; i <s.length();i++){
           char ch1 = s.charAt(i);
           int rv = 'z' - ch1 +1;
           sum += rv*(i+1); 
        }
        return sum;
        
    }
}