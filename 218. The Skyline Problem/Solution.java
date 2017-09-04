Let us understand through an example : [ [2 9 10], [3 7 15], [5 12 12], [15 20 10], [19 24 8] ].
Initially we push the start value and negative height and the end value and height height to a list.
Thus our list will look like :
[2,-10]
[9,10]
[3,-15]
[7,15]
[5,-12]
[12,12]
[15,-10]
[20,10]
[19,-8]
[24,8]
Now we sort this [x,y] values based on x. If x are same, we sort based on y.
Thus our new list looks like this :
[2,-10]
[3,-15]
[5,-12]
[7,15]
[9,10]
[12,12]
[15,-10]
[19,-8]
[20,10]
[24,8]

Now everytime the value is negative, meaning it is the starting of our building, we push the absolute value to a max heap.
Else we pop. The idea is that everytime the maximum value changes in the priority queue, we push the result into output.

In the starting our max is 0.
Next we push 10 to our Priority Queue ( Max Heap ).
As the max changes, we push 2 , 10  to our answer.
Next we push (3,15) to our answer as adding 15 changes the max.
After this , we do not ad 5,12 to our answer as pushing 12 does not change the max.
Now for [7,15] as the value is positive, it means it is end and we need to pop 15 from the priority heap.
Popping 15 changes the max to 12. Now we push [7,12] to our answer.
Next we pop 10 from our PQ. As popping 10 does not change our max, we do not push it to the result.
Again for [12,12], we pop 12 from the PQ. As the max now changes to 0, we push [ 12 , 0] to our result.
Next for [15,-10], we push 10 to the queue and as max changes, we push [ 15, 10] to our result.
Now again we need to push 8 to our PQ but not append [ 19, 8 ] to our answer as max does not change.
For [20,10] , we pop 10 from the queue and as our max now changes to 8, we push [ 20 , 8] to our result.
Finally, we pop 8 from the queue and because max changes to 0, we push [ 24 , 0] to our answer.

Thus our answer finally becomes :
[2,10],[3,15],[7,12],[12,0],[15,10],[20,8],[24,0].
