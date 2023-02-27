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
        int M = Integer.parseInt(st.nextToken()); // M번 공을 교환할 것

        int bucket [] = new int [N]; // N개의 바구니 생성
        for(int i = 0; i < bucket.length; i++) { // 초기값
            bucket[i] = i+1;
        }

        for(int x = 0; x < M; x++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st2.nextToken()); // i번 바구니
            int j = Integer.parseInt(st2.nextToken()); // j번 바구니 

            // 수를 교환
            int temp = bucket[i-1];
            bucket[i-1] = bucket[j-1];
            bucket[j-1] = temp;
        }

        for (int x : bucket)
            sb.append(x).append(" ");

        System.out.println(sb);
    }
}