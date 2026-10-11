class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int balance = 0;

        for(int i : nums){
            if(balance == 0){
                candidate = i;
            }

            if(i == candidate){
                balance ++;
            }
            else{
              balance --;
            }
           
        }
         return candidate;
    }
}