import java.util.*;
import java.io.*;

public class Main {
    private static final char ADD = 'I', REMOVE = 'D';
    private static final String EMPTY = "EMPTY";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());

            TreeMap<Integer, Integer> map = new TreeMap<>();

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                char cmd = st.nextToken().toCharArray()[0];
                int num = Integer.parseInt(st.nextToken());
                if (cmd == ADD) {
                    if (!map.containsKey(num)) {
                        map.put(num, 0);
                    }
                    map.put(num, map.get(num) + 1);
                } else {
                    if (map.isEmpty())
                        continue;
                    if (num == -1) {
                        int min = map.firstKey();
                        if (map.get(min) == 1) {
                            map.remove(min);
                        } else {
                            map.put(min, map.get(min) - 1);
                        }
                    } else {
                        int max = map.lastKey();
                        if (map.get(max) == 1) {
                            map.remove(max);
                        } else {
                            map.put(max, map.get(max) - 1);
                        }
                    }
                }
            }

            if (map.isEmpty()) {
                sb.append(EMPTY);
            } else {
                sb.append(map.lastKey()).append(" ").append(map.firstKey());
            }
            sb.append("\n");
        }
        System.out.append(sb);
    }
}