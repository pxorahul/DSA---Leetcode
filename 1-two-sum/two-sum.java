import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store value and its corresponding index
        Map<Integer, Integer> numToIndex = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement exists in our map
            if (numToIndex.containsKey(complement)) {
                // Return the index of the complement and the current index
                return new int[] { numToIndex.get(complement), i };
            }
            
            // If not found, add current number and index to the map
            numToIndex.put(nums[i], i);
        }
        
        // Per constraints, a solution always exists, but we return 
        // an empty array or throw an exception to satisfy the compiler.
        return new int[] {};
    }
}