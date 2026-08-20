class Solution {
    public double findMaxAverage(int[] arr, int k) {

       
	    int n = arr.length;
	    int sum = 0;
	    
	    for(int i = 0; i < k ; i++){
	        sum += arr[i];
	    }
	    
	    double max = sum;
	    for(int i = k; i < n ; i++){
	        sum = sum - arr[i-k] + arr[i];
	        max = Math.max(sum , max);
	    }
	    
	    return max/k;
        
    }
}