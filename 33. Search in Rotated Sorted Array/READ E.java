The idea here is to check if the array is sorted or not and accordingly move left or right.
Let us take the example where the array is [4,5,6,7,8,1,2] and the element to be searched is 8.
Here as the middle element is 7, we first check if the left side is sorted i.e[ 4,5,6,7]. As it is sorted
we check to see if the target element is within these bounds. If so we search in this array else in the right part.
In our case, 8 is greater so we search in the array [8,1,2].
Now in this case we see that the array [8,1] is not sorted. Hence we see if the right part is sorted. As 2 is sorted 
but the element to be searched is greater, we search on the left.
Now we just have a single element left and return the index.
