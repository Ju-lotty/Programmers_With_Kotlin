class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        for (i in 0..t.length - p.length) {
            val result: String = t.substring(i, i + p.length)
            if (result.toLong() <= p.toLong()) {
                answer++
            }
        }
        return answer
    }
}