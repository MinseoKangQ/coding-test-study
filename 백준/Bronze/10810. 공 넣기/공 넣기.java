import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken()); // N개의 바구니와 숫자
        int M = Integer.parseInt(st.nextToken()); // M번 공을 넣을 것

        int bucket [] = new int [N]; // N개의 바구니 생성

        for(int x = 0; x < M; x++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st2.nextToken()); // i번 바구니부터
            int j = Integer.parseInt(st2.nextToken()); // j번 바구니까지
            int k = Integer.parseInt(st2.nextToken()); // 숫자 k를 넣는다

            for(int y = i-1; y <= j-1; y++) {
                bucket[y] = k;
            }
        }

        for (int x : bucket)
            sb.append(x).append(" ");

        System.out.println(sb);
    }
}