//Solution 1
class Solution {
    public int findDuplicate(int[] nums) {
    HashSet<Integer> seen = new HashSet<>();
    for (int num : nums) {
        if (seen.contains(num)) {
            return num;
        }
        seen.add(num);
    }
    return -1;  // Just to satisfy the compiler, this should never be reached
}
}



//Solution 2
class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            if(arr[nums[i]]==1){
                return nums[i];
            }else{
                arr[nums[i]]=1;
            }
        }
        return 0;
    }
}
