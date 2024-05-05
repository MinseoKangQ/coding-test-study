import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        // 평균 구하기
        int avg = Math.round((float) sum / n);
        sb.append(avg).append("\n");

        // 배열 정렬
        Arrays.sort(arr);

        // 중앙값 구하기
        int center = arr[n / 2];
        sb.append(center).append("\n");

        // 최빈값 구하기
        int[] frequency = new int[8001];
        for (int num : arr) {
            frequency[num + 4000]++;
        }

        int maxFrequency = 0;
        int mode = 0;
        boolean found = false;

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mode = i - 4000;
                found = false;  // 새로운 최빈값이 나타나면 이전에 찾았던 두 번째 최빈값을 리셋
            } else if (frequency[i] == maxFrequency && !found) {
                mode = i - 4000;
                found = true;  // 두 번째로 작은 최빈값을 찾았다면 참으로 설정
            }
        }

        sb.append(mode).append("\n");

        // 범위 구하기
        int range = arr[n - 1] - arr[0];
        sb.append(range).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
