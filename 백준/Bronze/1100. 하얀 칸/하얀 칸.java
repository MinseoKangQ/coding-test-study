import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int line = 1;

        for(int i = 0; i < 8; i++) {
            
            if(line % 2 != 0) {
                String str = br.readLine();
                for(int j = 0; j <= 6; j+= 2) {
                    if(str.charAt(j) == 'F') count++;
                }
                line++;
            }

            else {
                String str = br.readLine();
                for(int j = 1; j <= 7; j += 2) {
                    if(str.charAt(j) == 'F') count++;
                }
                line++;
            }
            
        }
        
        System.out.println(count);
    }
}
