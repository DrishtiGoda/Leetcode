/*

Given an array of meeting time intervals intervals where intervals[i] = [starti, endi], return the minimum number of conference rooms required.

Example 1:
Input: intervals = [[0,30],[5,10],[15,20]]
Output: 2

*/


package Twitter;

public class _253 {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<Integer> pq = new PriorityQueue();

        for(int[] interval : intervals){
            if(!pq.isEmpty() && interval[0] >= pq.peek()){
                pq.poll();
            }
            pq.add(interval[1]);
        }
        return pq.size();
    }
}
