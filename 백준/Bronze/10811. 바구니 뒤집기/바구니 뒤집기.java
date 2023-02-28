import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st1.nextToken()); // 바구니의 개수
        int M = Integer.parseInt(st1.nextToken()); // 바구니의 순서를 바꿀 횟수

        ArrayList<Integer> bucket = new ArrayList<>(); // 바구니 생성
        for(int i = 0; i < N; i++) { // 바구니 초기값
            bucket.add(i+1);
        }

        for(int x = 0; x < M; x++) { // M번 반복
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st2.nextToken());
            int j = Integer.parseInt(st2.nextToken());

            // i번째부터 j번째 바구니를 역순으로 바꾼 것을 저장하는 ArrayList
            ArrayList<Integer> tempBucket = new ArrayList<>(); 

            // tempBucket에 저장
            for (int y = i - 1, z = 0; y <= j - 1; y++, z++) {
                tempBucket.add(bucket.get(y));
            }

            // 역순으로
            Collections.reverse(tempBucket);

            // tempBucket의 요소들을 bucket의 i번째부터 j번째에 저장
            for (int y = i - 1, z = 0; y <= j - 1; y++, z++) {
                bucket.set(y, tempBucket.get(z));
            }

        }

        // 출력할 문자열 저장
        for(int i = 0; i < N; i++) 
            sb.append(bucket.get(i)).append(" ");
        
        // 출력
        System.out.println(sb);
    }
}