The idea here is to use binary search. Let us understand from an example.
Suppose the array is : [8,5,6,1,3,7,2,2,2]
Initially we set low as 1 and high as 7( i.e length of array - 1).
Thus mid becomes 4. Now we traverse the array and count the number of elements
less than or equal to 4. In our case we have 5 elements. Thus we set the high
as 4. Next we calculate mid as 2. In the array, there are 4 elements less than or
equal to 2. Thus as the count is greater than 2, we set high as 2. Now low = 1
and high = 2. Next we set mid as 1. Now as the count of elements less than or equal to 1
is 1, we set low as 2. Now low is equal to high and thus we return 2 as the answer.
