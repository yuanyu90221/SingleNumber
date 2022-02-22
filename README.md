# SingleNumber

Implementation a function to find out the value that only show once given that an integer array input contains only one element that exist once and other elements show twice

## 參考解法

透過 XOR 的特性

a xOR b XOR b = a  iff a, b  belong to  integer

```kotlin
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
```

## 參考資料來源

[Recca Chao's Kata Single Number](https://gitpage.reccachao.net/kotlin/kata/single-number/)