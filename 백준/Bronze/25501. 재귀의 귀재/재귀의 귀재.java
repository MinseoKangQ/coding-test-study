import java.io.*;

public class Main {

    static int count = 0;

    public static int recursion(String s, int start, int end) {
        count++;
        if(start >= end) return 1;
        else if(s.charAt(start) != s.charAt(end)) return 0;
        else return recursion(s, start+1,end-1);
    }

    public static int isPalindrom(String s) {
        return recursion(s, 0, s.length()-1);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            String str = br.readLine();
            sb.append(isPalindrom(str)).append(" ");
            sb.append(count).append("\n");
            count = 0;
        }

        bw.write(sb.toString());
        bw.flush();
    }
}
