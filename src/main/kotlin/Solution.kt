class Solution {
  fun singleNumber(nums: IntArray): Int {
      val lastIndex: Int = nums.lastIndex
      if (lastIndex == 0) {
          return nums[lastIndex]
      }
      var answer: Int = 0
      for ( num in nums) {
          answer = answer xor num
      }
      return answer
  }
}