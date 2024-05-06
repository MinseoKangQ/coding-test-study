import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        // 3 2 3 2
        // 3 3 2 -> 6
        // 2 -> 2
        // 8

        Collections.sort(arr);
        Collections.reverse(arr);

        int set = n/3;

        int sum = 0;
        for(int i = 0; i < set; i++) { // set 번 반복

            int a1 = arr.get(i*3);
            int a2 = arr.get(i*3+1);
            int a3 = arr.get(i*3+2);

            sum += a1 + a2;

        }

        // 나머지 더하기
        if (n % 3 != 0) {
            if (n % 3 == 1) {
                // 마지막 인덱스 더하기
                sum += arr.get(n-1);
            }
            else {
                // 마지막 인덱스와 그 앞의 인덱스 더하기
                sum += arr.get(n-1) + arr.get(n-2);
            }

        }

        bw.write(sb.append(sum).toString());
        bw.flush();

        bw.close();
        br.close();
    }
}
