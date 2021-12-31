/*Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

Input: nums = [2,5,6,9,10]
Output: 2
Explanation:
The smallest number in nums is 2.
The largest number in nums is 10.
The greatest common divisor of 2 and 10 is 2.
*/

package Array;

public class _1979 {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int min = nums[0];
        int max = nums[nums.length-1];

        for(int i=1; i<=min; i++){
            if(min%i == 0 && max%i == 0)
                ans = i;
        }
        return ans;
    }
}
