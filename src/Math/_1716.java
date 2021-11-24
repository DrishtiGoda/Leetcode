/*Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.

He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday, he will put in $1 more than the day before. On every subsequent Monday, he will put in $1 more than the previous Monday.
Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.

Input: n = 4
Output: 10
Explanation: After the 4th day, the total is 1 + 2 + 3 + 4 = 10.

Input: n = 10
Output: 37
Explanation: After the 10th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37. Notice that on the 2nd Monday, Hercy only puts in $2.
*/



package Math;

public class _1716 {
    public int totalMoney(int n) {

        int sum = 0;
        int remainingDays = n%7;
        int week = n/7;
        int dayInitial = week + 1;
        int weekInitial = 28;

        for(int i = 1; i<= week; i++){
            sum += weekInitial;
            weekInitial += 7;
        }
        for(int i=1; i<= remainingDays; i++){
            sum += dayInitial;
            dayInitial++;
        }
        return sum;
    }
}
