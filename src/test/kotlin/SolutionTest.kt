import kotlin.test.Test
import kotlin.test.assertEquals

internal class SolutionTest {
    private val sol: Solution = Solution()
    @Test
    fun singleNumberExample1() {
        assertEquals(1, sol.singleNumber(intArrayOf(2,2,1)))
    }
    @Test
    fun singleNumberExample2() {
        assertEquals(4, sol.singleNumber(intArrayOf(4,1,2,1,2)))
    }
    @Test
    fun singleNumberExample3() {
        assertEquals(1, sol.singleNumber(intArrayOf(1)))
    }
}