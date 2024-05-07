import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int solution(int n, int [] arr) {


        /**
         * 팀 하나는 두 명으로 구성
         *
         * 예시1)
         * 1 7 5 8
         * 1 5 7 8
         * 1 8 5 7
         * (1,8)(5,7)
         * -> 9
         *
         * 예시2)
         * 1 7 3 5 9 2
         * 1 2 3 5 7 9
         * (1,9)(2,7)(3,5)
         * -> 8
         */

        // 배열 오름차순 정렬
        Arrays.sort(arr);

        // 배열 합 저장
        int min = Integer.MAX_VALUE;

        // 최소값 구하기
        for(int i = 0; i < n; i++) {
            int sum = arr[i] + arr[2*n-1-i];
            if (min > sum) {
                min = sum;
            }
        }


        return min;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int [] arr = new int[n*2];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n*2; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(sb.append(solution(n, arr)).toString());
        bw.flush();

        bw.close();
        br.close();
    }
}
