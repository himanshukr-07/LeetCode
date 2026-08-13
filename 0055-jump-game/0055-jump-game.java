class Solution {
    public boolean canJump(int[] nums) {
        int last = 0;
        for(int i = 0; i <= nums.length - 1; i++){
             if (i > last) {
                return false;
            }

            last = Math.max(last, i + nums[i]);
            if (last >= nums.length - 1){
                return true;
            }
        }
        return false;
    }
}