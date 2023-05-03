import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while(true) {

            st = new StringTokenizer(br.readLine());

            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());
            long z = Long.parseLong(st.nextToken());

            if(x == 0 && y == 0 && z == 0) break;

            if(x>y && x>z) {
                if (y * y  + z * z == x * x) sb.append("right").append("\n");
                else sb.append("wrong").append("\n");
            }
            else if(y>x && y>z) {
                if (x * x  + z * z == y * y) sb.append("right").append("\n");
                else sb.append("wrong").append("\n");
            }
            else {
                if (x * x  + y * y == z * z) sb.append("right").append("\n");
                else sb.append("wrong").append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();

    }
}
