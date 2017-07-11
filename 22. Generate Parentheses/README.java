The main idea here is that a left bracket can be added as long as we have not used up the left bracket and a right bracket can be added
as long as it does not outnumber the left brackets. We will use a recursive approach for this problem.

Let us take an example of n = 3.
Initially we call our function with left count as 3 and right count as 3.
Keep adding left brackets till the left count is 0. Each time you add a left bracket, decrement the count by 1.
After we add all 3 left brackets we add right brackets as long as right brackets are more than the left brackets.
Thus after first iteration of the recursion, we have ((())).

Now when the recursion comes back to the previous state, we replace the 2nd character with ) and thus our string becomes ( ( ) ) ) ).
Now as the count of left is more than 1 at this time, we replace the 3rd character with (.
It thus becomes ( ( ) ( ) ). Hence, we get our second string.

We keep adding the string once our left and right count becomes 0. 
