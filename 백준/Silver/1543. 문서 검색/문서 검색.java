import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
        
		int size1 = str1.length();
		int size2 = str2.length();
		
		str1 = str1.replace(str2, "");
		System.out.println((size1 - str1.length()) / size2);
	}

}