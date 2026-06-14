class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new LinkedList<>();
        if(numRows<1)
        {
            return ans;
        }
        List<Integer> first=new ArrayList();
        first.add(1);
        ans.add(first);
       for(int i=1;i<numRows;i++)
       {
         List<Integer> pre=new LinkedList<>();
         pre.add(1);
         for(int j=1;j<i;j++)
         {
            int val=first.get(j)+first.get(j-1);
            pre.add(val);
         }
         pre.add(1);
         ans.add(pre);
         first=pre;
       }
       return ans;
    }
}