The idea here is to use a boolean array called dp to keep track of the word indices which contains a word from the dictionary.
Then everytime we get a substring which is present in the worddict, we mark the next index of the boolean array as true. This indicates
that we can start our new sequence from here and makes sure that we get a continuous sequence.
For instance, if our word is "leetcode" and the worddict contains the words ["lee", "code"].
We initialize a boolean array of the length of string size + 1. dp[0] is set to 0.
Next as we see lee is present in the worddict, we set dp[3] as true. Next we find that code is in our dictionary.
However, as dp[4] is false, we cannot form a continuous word and thus at the end we return false.
