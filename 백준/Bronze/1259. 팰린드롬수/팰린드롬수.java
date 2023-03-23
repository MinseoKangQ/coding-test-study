import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = -1;

        while(true) {

            Boolean isPelindrom = true;

            num = Integer.parseInt(br.readLine());
            String stringNum = Integer.toString(num);

            if(num == 0) break;

            for(int i = 0, j = stringNum.length()-1; i <= stringNum.length()/2; i++, j--) {
                if(!(stringNum.charAt(i) == stringNum.charAt(j))) {
                    isPelindrom = false;
                    break;
                }
            }

            if(isPelindrom) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }

        System.out.print(sb);
    }
}
