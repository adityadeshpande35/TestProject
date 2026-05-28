package Leetcode;

public class MajorityElement {
	 public static int majorityElement(int[] nums) {

	        int cand=0;
	        int count=0;
	        for(int i=0;i<nums.length;i++)
	        {
	            if(count==0)
	            {
	                cand=nums[i];
	            }
	            if(cand==nums[i])
	            {
	                count++;
	            }
	            else
	            {
	                count--;
	            }

	        }
	        return cand;
	    }
	 

		public static void main(String[] args) {
			
			
			int nums[]= {3,2,3};
			int maxcount=majorityElement(nums);
			System.out.println(maxcount);
		}
}
