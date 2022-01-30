/*Given an integer n, return a string with n characters such that each character in such string occurs an odd number of times.
The returned string must contain only lowercase English letters. If there are multiples valid strings, return any of them.

Input: n = 4
Output: "pppz"
Explanation: "pppz" is a valid string since the character 'p' occurs three times and the character 'z' occurs once. Note that there are many other valid strings such as "ohhh" and "love".
*/


package String;

public class _1374 {
    public String generateTheString(int n) {
        int count = (n % 2 == 0) ? n - 1 : n;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++) {
            result.append('a');
        }

        if (n % 2 == 0) {
            result.append('b');
        }
        return result.toString();
    }
}
