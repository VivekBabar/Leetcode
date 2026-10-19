import java.util.*;
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
       Arrays.sort(nums);
       List<Integer> lr = new ArrayList<>();
    for(int i =0;i<nums.length;i++){
        if(nums[i] == target){
            lr.add(i);
        }
    }

       return lr;
    }

}