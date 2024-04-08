import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[][] people = new int[n][3]; // [][0]: 몸무게, [][1]: 키, [][2]: 등수
        
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            people[i][0] = Integer.parseInt(st.nextToken()); // 몸무게
            people[i][1] = Integer.parseInt(st.nextToken()); // 키
            people[i][2] = 1; // 초기 등수 설정
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i != j && people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                    people[i][2]++; // 자신보다 더 큰 덩치의 사람이 있으면 등수 증가
                }
            }
        }
        
        for(int i = 0; i < n; i++) {
            System.out.print(people[i][2] + " ");
        }
    }
}
