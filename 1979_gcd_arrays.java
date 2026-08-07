class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int  small = nums[0];
        int  lar = nums[n-1];
        
       while(small!=0){
        int temp=small;
        small = lar%small;
        lar = temp;
       }
        return lar;
    }
}