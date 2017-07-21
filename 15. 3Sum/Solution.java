public class Solution {
    
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0 , left = 0 , right = nums.length - 1;
        List < List < Integer > > ans = new ArrayList < List < Integer > >();
        ArrayList < Integer > temp;
        for ( int i = 0; i < nums.length; i++) {
            sum = 0;
            sum += nums[i];
            left = i + 1;
            right = nums.length - 1;
            while ( left < right ) {
                if(sum + nums[left] + nums[right] == 0) {
                    temp = new ArrayList < Integer >();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    ans.add(temp);
                    while(left < right && nums[left] == nums[left + 1])
                        left = left + 1;
                    while( left < right && nums[right] == nums[right - 1])
                        right = right - 1;
                    left++;
                    right--;
                }
                else if(sum + nums[left] + nums[right] < 0)
                    left++;
                else 
                    right--;
            }
            while(i < nums.length - 1 && nums[i] == nums[ i + 1 ])
                i++;
        }
        return ans;    
    }
}
