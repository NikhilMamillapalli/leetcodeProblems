class Solution {
    public int singleNumber(int[] nums) {
     
    /*  for(int i=0;i<nums.length;i++)
      {
         int sum=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[i]==nums[j])
            {
                sum++;
            }
            
        }
        if(sum==1)
            {
                return nums[i];
            }
            

      }
      return 1;*/
      int result=0;
      for(int i:nums)
      {
         result^=i;
      }
      return result;
    }

}