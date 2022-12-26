class Solution {
    fun solution(order: Int) = order.toString().filter { "369".contains(it)}.length
}