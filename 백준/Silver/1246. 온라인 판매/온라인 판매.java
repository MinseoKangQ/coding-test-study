import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // 달걀 개수
        int m = Integer.parseInt(st.nextToken()); // 잠재적 고객 수

        int [] arr = new int[m];

        for(int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        int decided = 0;

        // 오름차순 정렬
        Arrays.sort(arr);

        for(int i = 0; i < m; i++) {

            int person = m-i; // 몇 명이 계란을 구매하는지
            int money = arr[i]; // 책정된 가격

            if (max < person * money) {
                decided = money;
                if (n < person) { // 달걀 개수 < 사고자 하는 사람 수
                    person = n;
                }
                max = decided * person;
            }
        }

        sb.append(decided).append(" ").append(max);

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();

    }
}
