The idea here is to use a stack to store the elements from the end to front. In the hasNext() function, we first check 
whether the current element in the stack is a single integer by using the isInteger() API of NestedInteger interface.
If so , we simply return true. Else we keep popping the element from the stack and flatten it at each iteration.
To flatten the list simply iterate from the size of the nested list by using the getList().size() and adding elements
from the end to front. When the next() function is called, we thus simply need to pop and return the element. 
