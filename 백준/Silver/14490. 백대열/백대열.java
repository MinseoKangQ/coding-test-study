import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        String[] split = str.split(":");

        int num1 = Integer.parseInt(split[0]);
        int num2 = Integer.parseInt(split[1]);

        int divideTo;
        if (num1 >= num2) {
            divideTo = getGCD(num1, num2);
        }
        else {
            divideTo = getGCD(num2, num1);
        }

        sb.append(num1/divideTo).append(":").append(num2/divideTo);

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();

    }

    public static int getGCD(int n, int m) {
        if (n % m == 0) return m;
        return getGCD(m, n%m);
    }
}
