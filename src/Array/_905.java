/*Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
Return any array that satisfies this condition.

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

*/

package Array;

public class _905 {
    public int[] sortArrayByParity(int[] nums) {
        int even = 0;
        int odd = nums.length-1;
        int array[] =new int[nums.length];

        for(int i=0; i<nums.length;i++){

            if(nums[i]%2 == 0){
                array[even] = nums[i];
                even++;
            } else{
                array[odd] = nums[i];
                odd--;
            }
        }
        return array;
    }
}
