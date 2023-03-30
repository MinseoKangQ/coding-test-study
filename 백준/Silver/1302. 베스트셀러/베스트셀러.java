import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hashMap = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        // 제목과 횟수를 hashMap에 넣기
        for(int i = 0; i < N; i++) {
            String title = br.readLine();
            if(!hashMap.containsKey(title)) {
                hashMap.put(title, 1);
            }
            else {
                int count = hashMap.get(title);
                hashMap.replace(title, count+1);
            }
        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());

        // 수 큰것부터 정렬
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue()); // 내림차순
            }
        });

        int max = 0;

        // 제일 큰 값 가져와서 저장
        for(Map.Entry<String, Integer> entry : entryList) {
            max = entry.getValue();
            break;
        }

        // 제일 큰 값이면 arr에 저장
        for(Map.Entry<String, Integer> entry : entryList) {
            if(entry.getValue() == max) {
                arr.add(entry.getKey());
            }
        }

        // arr 정렬 => 같은 값 중에서 사전순으로 정렬
        Collections.sort(arr);

        System.out.println(arr.get(0));

    }
}
