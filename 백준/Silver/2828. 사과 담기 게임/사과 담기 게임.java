import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(br.readLine());
        
        int answer = 0;	// 이동 횟수 저장
        int start = 1, end = M;	// 바구니 시작, 끝 위치
        
        //사과 바구니에 담기
        for(int i = 0; i < j; i++){
            int apple = Integer.parseInt(br.readLine());
            if(start > apple){ // 시작 위치 > 사과 위치
                answer += start - apple; // 이동 거리 더하기
                end -= start - apple; // 끝 위치 변경
                start = apple; //시작 위치 변경
            }else if(end < apple){ // 끝 위치 < 사과 위치
                answer += apple - end; // 이동 거리 더하기
                start += apple - end; //시작 위치 변경
                end = apple; //끝 위치 변경
            }
        }
        
        bw.write(answer + ""); //이동 거리 BufferedWriter 저장
        bw.flush();
        bw.close();
        
        br.close();
    }
}