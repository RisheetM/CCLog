// best solution for space
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int n =nums.length;
        for(int i=0;i<n;i++){
            if(hashMap.containsKey(nums[i])){
                int j =hashMap.get(nums[i]);
                j++;
                hashMap.put(nums[i],j);
            }else{
                hashMap.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer, Integer> e : hashMap.entrySet()){
            if(e.getValue()>n/2){
                return e.getKey();
            }
        }
        return 0;
    }
}

// best solution for time
lass Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}