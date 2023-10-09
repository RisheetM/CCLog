public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int n=A.length;
        int[] ans= new int[2];
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=0;
        }
        for(int i=0;i<n;i++){
            nums[A[i]-1]++;
        }
        for(int i=0;i<n;i++){
            if(nums[i]==2){
                ans[0]=i+1;
            }else if(nums[i] == 0){
                ans[1]=i+1;
            }
        }
        return ans;
    }
}
