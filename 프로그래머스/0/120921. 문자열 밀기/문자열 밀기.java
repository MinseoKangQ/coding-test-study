class Solution {
    public int solution(String A, String B) {
                int count = 0;
        boolean isAnswer = false;

        StringBuilder str;

        for(int i = 0; i < A.length()-1 ; i++) { // 문자열 길이-1 만큼 반복

            if(A.equals(B)) {
                isAnswer = true;
                break;
            }

            count++;
            char lastChar = A.charAt(A.length()-1); // 마지막 글자 저장
            str = new StringBuilder();
            str.append(lastChar); // 마지막 글자가 첫 글자로 온다
            for(int j = 0; j < A.length()-1; j++) {
                str.append(A.charAt(j));
            }

            String resultStr = str.toString();
            A = resultStr;
            System.out.println(resultStr);
            if(resultStr.equals(B)) {
                isAnswer = true;
                break;
            }

        }

        if (isAnswer) return count;
        else return -1;
    }
}