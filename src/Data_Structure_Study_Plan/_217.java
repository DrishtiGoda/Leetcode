/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Input: nums = [1,2,3,1]
Output: true

Input: nums = [1,2,3,4]
Output: false
*/

package Data_Structure_Study_Plan;

public class _217 {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> found = new HashSet<>();

        if (nums.length <= 1) {
            return false;
        }
        for (int n: nums){
            if(!found.add(n)){
                return true;
            }
        }
        return false;
    }
}
