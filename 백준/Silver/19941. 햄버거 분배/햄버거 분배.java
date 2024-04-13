import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static int solution(int n, int k, String str) {

        int answerCount = 0;
        int personCount = 0;

        char [] c = str.toCharArray();

        for(char x : c) {
            if (x == 'P') personCount++;
        }

        int [] person = new int[personCount];

        int personIndex = 0;
        for(int i = 0; i < str.toCharArray().length; i++) {
            if (str.charAt(i) == 'P') {
                person[personIndex] = i;
                personIndex++;
            }
        }

        for(int i = 0; i < person.length; i++){
            for(int j = person[i]-k; j <= person[i] + k; j++) {
                if (j <= -1 || j >= c.length) continue;

                if (c[j] == 'H') {
                    answerCount++;
                    c[j] = 'O';
                    break;
                }
            }
        }


        return answerCount;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        String str = br.readLine();

        bw.write(sb.append(solution(N, K, str)).toString());
        bw.flush();

        bw.close();
        br.close();
    }
}
