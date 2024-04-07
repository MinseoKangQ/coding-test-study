import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static String [] solution(int n , int m, ArrayList<String> arr) {

        String [] answerArr = new String[2];
        int answerCount = 0;

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < m; i++) { // 문자열 길이만큼 반복
            int [] count = new int[4];

            for(int j = 0; j < n; j++) { // DNA 개수만큼 반복
                char current = arr.get(j).charAt(i);
                if (current == 'A') count[0]++;
                else if (current == 'C') count[1]++;
                else if (current == 'G') count[2]++;
                else count[3]++;
            }

            int maxIndex = -1;
            int maxCount = Integer.MIN_VALUE;

            for(int k = 0; k < 4; k++) {
                if (count[k] > maxCount) {
                    maxCount = count[k];
                    maxIndex = k;
                }
            }

            if (maxIndex == 0) sb.append("A");
            else if (maxIndex == 1) sb.append("C");
            else if (maxIndex == 2) sb.append("G");
            else sb.append("T");
        }

        String s = sb.toString(); // S 구하기 끝

        for(int i = 0; i < m; i++) { // 문자열 길이만큼 반복
            for(int j = 0; j < n; j++) { // DNA 개수만큼 반복
                char current = arr.get(j).charAt(i);
                if (current != s.charAt(i)) answerCount++;
            }
        } // Hamming Distance 합 끝

        answerArr[0] = s;
        answerArr[1] = String.valueOf(answerCount);

        return answerArr;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        ArrayList<String> arr = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // DNA 수
        int M = Integer.parseInt(st.nextToken()); // 문자열 길이

        for(int i = 0 ; i < N; i++) {
            arr.add(br.readLine());
        }

        String [] answer = solution(N, M, arr);

        for(String s : answer) {
            sb.append(s).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();
    }
}
