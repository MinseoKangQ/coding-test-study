import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static int charIndex(char c) {
        switch (c) {
            case 'A': return 0;
            case 'C': return 1;
            case 'G': return 2;
            case 'T': return 3;
            default: throw new IllegalArgumentException("NO");
        }

    }

    public static boolean isValid(int [] counts, int [] arr) {

        for(int i = 0; i < 4; i++) {
            if (counts[i] < arr[i]) return false;
        }

        return true;

    }

    public static int solution(int sLength, int pLength, String str, int [] arr) {

        int [] counts = new int[4]; // A C G T
        int validCount = 0;

        // 첫 번째 카운트 초기화
        for(int i = 0; i < pLength; i++) {
            counts[charIndex(str.charAt(i))]++;
        }

        // 첫 번째가 유효한지 확인
        if (isValid(counts, arr)) {
            validCount++;
        }

        for(int i = pLength; i < sLength; i++) {
            // 카운트 업데이트
            counts[charIndex(str.charAt(i - pLength))]--;
            counts[charIndex(str.charAt(i))]++;

            // 새로운 확인
            if (isValid(counts, arr)) {
                validCount++;
            }
        }

        return validCount;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int sLength = Integer.parseInt(st.nextToken());
        int pLength = Integer.parseInt(st.nextToken());

        String str = br.readLine();

        st = new StringTokenizer(br.readLine(), " ");

        /**
         * A C G T
         */
        int [] arr = new int[4];

        for(int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        sb.append(solution(sLength, pLength, str, arr));

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();


    }
}
