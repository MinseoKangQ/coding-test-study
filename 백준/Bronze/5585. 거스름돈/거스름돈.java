import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int answer = 0;
        int remain = 1000 - N;

        int [] arr = { 500, 100, 50, 10, 5, 1};

        int current = 0;
        while (remain != 0) {
            if (remain < arr[current]) current++;
            else {
                answer++;
                remain -= arr[current];
            }

        }


        bw.write(sb.append(answer).toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
