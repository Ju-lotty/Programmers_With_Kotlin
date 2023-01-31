class Solution {
    fun solution(answers: IntArray): IntArray {
        var supo1 = intArrayOf(1, 2, 3, 4, 5)
        var supo2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        var supo3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        var cnt = IntArray(3)
        //answers.indeces
        for(i in 0 until answers.size) {
            if(answers[i] == supo1[i%5]) cnt[0]++
            if(answers[i] == supo2[i%8]) cnt[1]++
            if(answers[i] == supo3[i%10]) cnt[2]++
        }
        
        var max = cnt.maxOrNull()
        var answer = mutableListOf<Int>()
        for(i in 0..2) {
            if(cnt[i]==max) answer.add(i+1)
        }
        return answer.toIntArray()
    }
}