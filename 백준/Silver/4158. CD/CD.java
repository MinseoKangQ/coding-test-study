import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static int solution(int [] arr1, int [] arr2) {

        int answer = 0;
        int p1 = 0, p2 = 0;

        while (p1 < arr1.length && p2 < arr2.length) {

            if (arr1[p1] == arr2[p2]) {
                answer++;
                p1++;
                p2++;
            }
            else if (arr1[p1] < arr2[p2]) p1++;
            else p2++;

        }

        return answer;

    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            if(N == 0 && M == 0) break;

            int [] arr1 = new int[N];
            int [] arr2 = new int[M];

            for(int i = 0; i < N; i++) {
                arr1[i] = Integer.parseInt(br.readLine());
            }

            for(int i = 0; i < M; i++) {
                arr2[i] = Integer.parseInt(br.readLine());
            }

            sb.append(solution(arr1, arr2)).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();


    }
}
