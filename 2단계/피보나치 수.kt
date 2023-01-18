class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var f1= 0
        var f2 = 1
        for(i in 2..n) {
            answer = (f1+f2) % 1234567
            f1 = f2 % 1234567
            f2 = answer
        }
        return answer
    }
}