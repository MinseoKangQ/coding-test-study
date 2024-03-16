
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static int solution(int A, int B, int D) {

        int answer = 0;
        int [] arr = new int[B+1];

        if(A == 1 && B == 1) return 0;
        for(int i = 2; i <= B; i++) {
            if (arr[i] == 0) { // 소수이다
                for(int j = i*2; j <= B; j+=i) {
                    arr[j] = 1;
                }
            }
        }

        String stringB = String.valueOf(D);

        for(int i = A; i <= B; i++) {
            if(arr[i] == 0) { // 소수이면
                // 이 숫자를 String 으로 바꾸고 문자가 D를 포함하는지 확인
                if (String.valueOf(i).contains(stringB)) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken(" "));
        int B = Integer.parseInt(st.nextToken(" "));
        int D = Integer.parseInt(st.nextToken(" "));

        sb.append(solution(A, B, D));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

