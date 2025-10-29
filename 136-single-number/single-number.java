class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int i = -1;
        // Count frequencies
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Print elements that occur exactly once
        //System.out.println("Elements that appear exactly once:");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                i = entry.getKey();
                break;
            }
        }
        return i;
    }
}