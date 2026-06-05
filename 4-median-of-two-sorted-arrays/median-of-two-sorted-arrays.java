class Solution {
                 //NikhilMamillapalli
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        int k=0;
        int i=0;
        int j=0;
        while(i<nums1.length&&j<nums2.length)
        {
            if(nums1[i]>nums2[j])
            {
                arr[k]=nums2[j];
                j++;
            }
            else if(nums1[i]<nums2[j])
            {
                arr[k]=nums1[i];
                i++;
            }
            else
            {
                arr[k]=nums1[i];
                i++;
            }
            k++;
        }
         while (i < nums1.length) {
            arr[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            arr[k++] = nums2[j++];
        }
        
        
        int totalLen = arr.length;
        if (totalLen % 2 != 0) {
            return arr[totalLen / 2];
        } else {
            return (arr[(totalLen / 2) - 1] + arr[totalLen / 2]) / 2.0;
        }
    }
}