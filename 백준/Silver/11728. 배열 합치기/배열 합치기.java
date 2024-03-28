import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static ArrayList<Integer> solution(int N, int M, int [] A, int [] B) {

        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while (p1 < N && p2 < M) {

            if(A[p1] <= B[p2]) answer.add(A[p1++]);
            else answer.add(B[p2++]);


        }

        // a 배열이 남아있는 경우
        while(p1 < N) answer.add(A[p1++]);

        // b 배열이 남아있는 경우
        while(p2 < M) answer.add(B[p2++]);

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [] A = new int[N];
        int [] B = new int[M];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> answer = solution(N, M, A, B);

        for(int i : answer) {
            sb.append(i).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();

    }
}
