import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static int reCalculate(int x, int y) {
        return (int) Math.floor((long) y * 100 / x);
    }

    public static int solution(int x, int y) {

        int answer = -1;

        // 현재 승률 계산
        int z = reCalculate(x, y);

        // 이분 탐색
        int lt = 0, rt = 1000000000;

        while (lt <= rt) {

            int mid = (lt + rt) / 2;

            if (reCalculate(x + mid, y + mid) != z) {
                answer = mid;
                rt = mid - 1; // 최소값을 찾기 위함
            }
            else {
                lt = mid + 1;
            }

        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        bw.write(sb.append(solution(x, y)).toString());
        bw.flush();

        bw.close();
        br.close();
    }
}
