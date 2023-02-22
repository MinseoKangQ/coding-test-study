import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 수의 개수

        // 카운팅 정렬
        int [] arr = new int [10001]; // 수의 범위는 0 ~ 10000
        for(int i = 0; i < N; i++) { // 수의 개수 만큼 반복
            int num = Integer.parseInt(br.readLine());
            arr[num]++;
        }

        // 출력
        for(int i = 0; i < arr.length; i++) {
            while(arr[i]-- > 0) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);

    }
}