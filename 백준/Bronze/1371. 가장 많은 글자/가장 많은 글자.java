import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input;		
		String S = ""; // 합쳐진 문자열
		
		// null값이 오지 않을떄만 반복한다는 반복문
		while((input = br.readLine()) != null) {
			S += input;
		}
		
		//문자열에 저장된 알파벳 개수의 최댓값을 저장 할 변수
		int max = 0;
		
        //최댓값을 가지는 알파벳을 저장 할 문자열 변수
		String Smax = "";
		
        // 아스키 코드 97 ~ 122
		for(char i = 97; i < 123; i++) {
			int count = S.length() - S.replace(String.valueOf(i), "").length();
			
			if(max == count) {
				Smax += String.valueOf(i);
			}
			
			if(max < count) {
				max = count;
				Smax = String.valueOf(i);
			}
		}
		System.out.println(Smax);
	}

}
