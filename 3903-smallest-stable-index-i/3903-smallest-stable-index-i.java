class Solution {
    public int firstStableIndex(int[] nums, int n) {

        int max = Integer.MIN_VALUE;
        for(int i =0 ; i < nums.length ; i++){
        int min = Integer.MAX_VALUE;

        for(int j = 0 ;  j <= i ; j++ ){
           
                max = Math.max(nums[j], max);
            
        }
        for(int k = i ; k< nums.length ; k++){
           
                min = Math.min(min , nums[k]);
            
        }

        if((max-min)<= n){
            return i;
        }

        }

        return -1;
    }
}