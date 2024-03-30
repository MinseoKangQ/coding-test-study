import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static int solution(int N) {


        int count = 1;
        int tmp;

        for(int i = 1; i < N; i++) {
            tmp = 0;
            for(int j = i; j < N; j++) {
                tmp += j;

                if(tmp > N) break;
                else if (tmp == N) count++;
            }

        }

        return count;

    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        sb.append(solution(N));

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();
    }
}
