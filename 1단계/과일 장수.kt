class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        // 사과 박스 담을 갯수
        val box = score.size / m
        //사과 점수 내림차순 정렬
        score.sortDescending()
        for(i in 1..box) {
             // (박스에 담긴 최소 값) * m
            answer += score[m*i-1] * m;
        }
        return answer
    }
}