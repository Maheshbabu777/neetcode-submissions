class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                res[0]=map.get(nums[i]);
                res[1]=i;
            }
            map.put(target-nums[i],i);
        }
        return res;
    }
}
