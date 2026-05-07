class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> intSet = new HashSet<>();

        for(int num : nums){
            if(!(intSet.add(num)))
                return true;
            // intSet.add(num);
            }
        return false;  
    }
}