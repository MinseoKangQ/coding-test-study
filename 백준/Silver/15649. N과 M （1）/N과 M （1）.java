import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int [] arr;
    public static boolean [] visit;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[M]; // 몇 줄
        visit = new boolean[N]; // 한 줄에 숫자 몇 개
        dfs(N, M, 0);
        System.out.print(sb);

    }

    public static void dfs(int N, int M, int depth) {

        if(depth == M) { // 빠져나오는 조건
            for(int x : arr) {
                sb.append(x).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 0; i < N; i++) { // 숫자의 개수만큼 반복

            if(!visit[i]) { // 방문하지 않았다면
                visit[i] = true; // 방문했다고 표시하고
                arr[depth] = i+1; // ?
                dfs(N, M, depth+1); // 재귀 함수 호출
                visit[i] = false; // 방문하지 않았다고 표시
            }

        }
    }
}
