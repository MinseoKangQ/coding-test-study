import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();
        String newString;
        
        String str = br.readLine();
        
        for(int i = 0; i <= str.length(); i++) {
            for(int j = i; j <= str.length(); j++) {
                if(j <= i) newString = str.substring(j, i);
                else newString = str.substring(i, j);
                if(newString.equals("")) continue;
                if(!set.contains(newString)) {
                    set.add(newString);
                }
            }
        }

        System.out.println(set.size());
    }
}
