import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (N != 0) {
            int minCount = 1; // 1개부터 시작
            int currentBoxWeight = 0;

            int [] arr = new int[N];
            st = new StringTokenizer(br.readLine(), " ");

            for(int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int index = 0;
            while(true) {

                if(index == N) break;

                if (currentBoxWeight + arr[index] > M) { // 넘으면 못담음, 다음 상자에 담아야 함
                    currentBoxWeight = arr[index];
                    minCount++;
                } else { // 그렇지 않으면 담을 수 있음
                    currentBoxWeight += arr[index];
                }

                index++;
            }

            bw.write(sb.append(minCount).toString());
            bw.flush();
        }
        else {
            bw.write(sb.append(0).toString());
            bw.flush();
        }

        bw.close();
        br.close();

    }
}
