class MovingAverage {
    
    private int count;
    private int sum;
    private int temp_size;
    private int[] arr;
    private int index;
    

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        count = 0;
        sum = 0;
        temp_size = size;
        index = 0;
        arr = new int[temp_size];
        
    }
    
    public double next(int val) {
        double ans;
        if(count >= temp_size) {
            sum -= arr[index % temp_size];
            sum += val;
            ans = (double) sum / count;
            arr[index % temp_size] = val;
            index++;
        }
        else {
            arr[index % temp_size] = val;
            sum += val;
            count++;
            ans = (double) sum / count;
            index++;
        }
        return ans;
        
    }
}
