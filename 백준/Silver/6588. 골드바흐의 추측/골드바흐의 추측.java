import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        boolean [] prime = new boolean[1000001];
        
        prime[0] = prime[1] = true; // 소수가 아니다

        for(int i = 2; i < Math.sqrt(prime.length); i++) {

            // 소수가 아니면 반복
            if(prime[i]) continue;

            // 소수면 소수의 배수들을 소수가 아니라고 표시
            for(int j = i*i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

        while(true) { // 무한 반복

            int n = Integer.parseInt(br.readLine()); // 입력 받기
            if(n == 0) break; // 0을 입력 받았다면 종료
            boolean isPossible = false; // 추측이 가능한지 확인하는 변수
            
            // 차가 가장 큰 것을 출력하기 위해 i는 3부터 증가, j는 n-3부터 감소
            for(int i = 3, j = n-3; i <= n/2; i++, j--) {
                if(!prime[i] && !prime[j]) {
                    sb.append(n).append(" = ").append(i).append(" + ").append(j).append("\n");
                    isPossible = true;
                    break;
                }
            }

            // 추측이 불가능하다면 다음 문구 저장
            if(!isPossible) sb.append("Goldbach's conjecture is wrong.").append("\n");
        }

        // 출력
        bw.write(sb.toString());
        bw.flush();
    }
}