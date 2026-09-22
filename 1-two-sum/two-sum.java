class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> santo=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int c=target-nums[i];
            if(santo.containsKey(c)){
            return new int[]{santo.get(c),i};}
            santo.put(nums[i],i);
        }
        return new int[] {};
        }
}