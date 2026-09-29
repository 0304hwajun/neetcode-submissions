class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i])) {
                return true;
            }
            seen.add(nums[i]);
        }
        return false;
    }
}

// create a hashset that contains all numbers that are seen in the 'nums' list
// everytime you add a number, check if there is any numbers that are identical as ones in the hashset
// if there is, then its true, if not, then false.