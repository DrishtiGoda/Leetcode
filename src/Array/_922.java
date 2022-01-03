/*
Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
Return any answer array that satisfies this condition.

Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
*/

package Array;

public class _922 {
    public int[] sortArrayByParityII(int[] nums) {
        int evenindex = 0;
        int oddindex = 1;
        int[] result = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            if (nums[i] % 2 == 0 ){
                result[evenindex] = nums[i];
                evenindex += 2;
            }
            else{
                result[oddindex] = nums[i];
                oddindex += 2;
            }
        }
        return result;
    }
}
