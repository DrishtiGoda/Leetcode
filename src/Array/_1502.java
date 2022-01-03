/*A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.

Input: arr = [3,5,1]
Output: true
Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.
*/


package Array;

public class _1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int  result = arr[1] - arr[0];
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1] - arr[i] != result){
                return false;
            }
        }
        return true;
    }
}
