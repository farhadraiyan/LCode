package main;

public class Problems {
	
	/*Given an array nums and a value val, remove all instances of that value in-place and return the new length.

	Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

	The order of elements can be changed. It doesn't matter what you leave beyond the new length.

	Clarification:

	Confused why the returned value is an integer but your answer is an array?

	Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller as well.

	Internally you can think of this:

	// nums is passed in by reference. (i.e., without making a copy)
	int len = removeElement(nums, val);

	// any modification to nums in your function would be known by the caller.
	// using the length returned by your function, it prints the first len elements.
	for (int i = 0; i < len; i++) {
	    print(nums[i]);
	}
	 

	Example 1:

	Input: nums = [3,2,2,3], val = 3
	Output: 2, nums = [2,2]
	Explanation: Your function should return length = 2, with the first two elements of nums being 2.
	It doesn't matter what you leave beyond the returned length. For example if you return 2 with nums = [2,2,3,3] or nums = [2,2,0,0], your answer will be accepted.
	Example 2:

	Input: nums = [0,1,2,2,3,0,4,2], val = 2
	Output: 5, nums = [0,1,4,0,3]
	Explanation: Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4. Note that the order of those five elements can be arbitrary. It doesn't matter what values are set beyond the returned length.
	 

	Constraints:

	0 <= nums.length <= 100
	0 <= nums[i] <= 50
	0 <= val <= 100*/
	public int problem27(int[] nums, int val ){
		//array elements is 1
		int start = 0;
		int end = 1;
		if(nums.length==1) {
			if(nums[0]==val) {
				return 0;
			}
			return 1;
		}
		else
		{
			while(end<nums.length) {
				if(nums[start]==val) {
					if(nums[end]==val) {
						end++;
						
					}else {
						nums[start]=nums[end];
						nums[end]= val;
						end++;start++;
					}
				}
				else {
					if(nums[end]!=val && end == nums.length-1) {
						start++;
					}
					start++;end++;
				}
			}
		}
		return start;
		
	}

	/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
Example 4:

Input: nums = [1,3,5,6], target = 0
Output: 0
Example 5:

Input: nums = [1], target = 0
Output: 0
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104*/
	
	public int searchInsert(int[] nums, int target) {
		
		//casesInput: nums = [1,3,5,6], target = 2
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target) {
				return i;
			}
			else {
				if(nums[i]>target) {
					return i;
				}
			}
		}
		return 0;
	}
	
}
