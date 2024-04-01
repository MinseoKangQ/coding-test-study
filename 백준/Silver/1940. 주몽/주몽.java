import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int solution(int n, int m, int [] arr) {

        int answer = 0;

        Arrays.sort(arr);

        // 1 2 3 4 5 7
        for(int i = 0; i < n-1; i++) {
            int tmp = 0;
            int j = i+1;
            while (m > tmp) {

                if (j == n) break;

                tmp = arr[i] + arr[j];

                if(tmp == m) {
                    answer++;
                    break;
                }

                j++;
            }

        }

        return answer;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 재료의 개수
        int M = Integer.parseInt(br.readLine()); // 갑옷을 만드는 데 필요한 수

        int [] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(sb.append(solution(N, M, arr)).toString());
        bw.flush();

        bw.close();
        br.close();

    }
}
