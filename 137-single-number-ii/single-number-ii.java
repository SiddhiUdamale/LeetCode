class Solution {
    public int singleNumber(int[] nums) {
        int no = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
            if(entry.getValue() == 1){
                no = entry.getKey();
                break;
            }
        }
        return no;
    }
}