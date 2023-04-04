import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> hashMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String isEnter = st.nextToken();

            // 이름이 존재하지 않으면 hashMap에 넣기
            if(!hashMap.containsKey(name)) {
                hashMap.put(name, isEnter);
            }

            // 이름이 존재하면 isEnter가 leave가 맞는지 확인하고 해당 이름 삭제
            else {
                if(isEnter.equals("leave")) {
                    hashMap.remove(name);
                }
            }
        }

        List<String> list = new ArrayList<>(hashMap.keySet());
        Collections.sort(list);
        Collections.reverse(list);

        for(String s : list) {
            sb.append(s).append("\n");
        }

        System.out.print(sb);

    }
}
