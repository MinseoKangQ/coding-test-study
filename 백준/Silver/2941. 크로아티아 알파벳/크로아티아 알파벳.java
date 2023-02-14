import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 크로아티아 문자열 저장 배열
        String croatia [] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        // 문자열 입력받기
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        // 크로아티아 문자가 있으면 해당 문자 바꾸기
        for(int i = 0; i < croatia.length; i++) {
            if(s.contains(croatia[i])) {
                s = s.replace(croatia[i], "*");
            }
        }

        System.out.println(s.length());

    }
}