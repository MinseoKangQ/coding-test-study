class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for (int eachArr : arr) { sum += eachArr; }
        answer = (double)sum/arr.length;
        return answer;
    }
}