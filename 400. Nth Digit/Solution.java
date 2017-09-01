/* Reference from the top most discussed post of the question */

3 steps involved here :
1. Finding the length
2. Finding the number
3. Find the nth digit and return

To find the length, keep subtracting till n > ( len * count). Initially, len = 1 and count = 9. Multiply count by 2
and increment len. At the end we get length.
To find the number, start = start + ( n - 1) / len. For instance, the start for 13th character would be 
n = 13 - 1 * 9 = 4 so start = 10 + (4 - 1 ) / 2 = 11
To find the nth digit, return "11"charAt(n-1 % len) which is "11".charAt(3/2) which is 1.
We thus return 1 as the answer.
