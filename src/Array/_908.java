/*
You are given an integer array nums and an integer k.
In one operation, you can choose any index i where 0 <= i < nums.length and change nums[i] to nums[i] + x where x is an integer from the range [-k, k]. You can apply this operation at most once for each index i.
The score of nums is the difference between the maximum and minimum elements in nums.
Return the minimum score of nums after applying the mentioned operation at most once for each index in it.

Input: nums = [1], k = 0
Output: 0
Explanation: The score is max(nums) - min(nums) = 1 - 1 = 0.

*/

package Array;

public class _908 {
    public int smallestRangeI(int[] A, int k) {

        int min = A[0], max = A[0];

        for(int i = 0; i< A.length ; i++){
            if(A[i]> max )
                max= A[i];
            else{
                if(A[i] < min)
                    min = A[i];
            }
        }
        if(max - min - 2*k <= 0)  return 0;
        return max -min -2*k;
    }
}
