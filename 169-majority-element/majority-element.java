class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int num:nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }
        int maxFreq = -1;

       // System.out.println("Elements with the highest frequency (" + maxFreq + "):");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > (nums.length/2)) {
                maxFreq = entry.getKey();
                break;
            }
        }
        return maxFreq;
    }
}