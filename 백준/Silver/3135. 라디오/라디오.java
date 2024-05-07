import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static int solution(int a, int b, int n, int [] arr) {

        // 시작 위치 결정하기
        // a 인가, arr 중 하나 인가
        int start = a;
        int mostClose = Math.abs(a-b);; // b와 얼마나 가까운지, 가장 가까운 지점

        for(int i = 0; i < arr.length; i++) {
            int abs = Math.abs(b - arr[i]);
            if (abs < mostClose) {
                start = arr[i];
                mostClose = abs;
            }
        }

        int count;
        if (start == b) return 1; // b에서 시작한다면 출발지와 도착지가 같으므로 한 번 만에 성공
        else if (start == a) count = 0;
        else count = 1;

        while (start != b) {
            count++;

            if (start > b) start--; // 시작점이 도착지보다 크다면 감소
            else start++; // 그렇지 않다면 증가
        }

        return count;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        bw.write(sb.append(solution(a, b, n, arr)).toString());
        bw.flush();

        bw.close();
        br.close();
    }
}
