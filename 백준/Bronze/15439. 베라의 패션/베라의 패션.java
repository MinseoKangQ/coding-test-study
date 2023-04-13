import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = N * N;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(i == j) {
                    count--;
                    break;
                }
            }
        }

        System.out.println(count);

    }
}
