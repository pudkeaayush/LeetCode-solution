class Solution {
    public int maximumSwap(int num) {
        char[] arr = Integer.toString(num).toCharArray();
        int[] map = new int[10];
        
        for( int i = 0; i < arr.length; i++)
            map[arr[i] - '0'] = i;
        
        for( int i = 0; i < arr.length; i++) {
            for( int j = 9; j > arr[i] - '0'; j--) {
                if(map[j] > i) {
                    char temp = arr[i];
                    arr[ i ] = arr[map[j]];
                    arr[map[j]] = temp;
                    return Integer.valueOf(new String(arr));
                }
            }
        }
        return num;
    }
}
