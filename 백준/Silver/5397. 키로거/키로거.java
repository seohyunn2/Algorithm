import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < n; i++) {
            String line = in.readLine();
            bw.write(getPw(line));
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    public static String getPw(String line) {
        char[] input = line.toCharArray();
        LinkedList<Character> pw = new LinkedList<>();
        ListIterator<Character> iter = pw.listIterator();

        for(int i = 0; i < input.length; i++) {
            char c = input[i];
            if(c == '<') {
                if(iter.hasPrevious()) {
                    iter.previous();
                }
            } else if(c == '>') {
                if(iter.hasNext()) {
                    iter.next();
                }
            } else if(c == '-') {
                if(iter.hasPrevious()) {
                    iter.previous();
                    iter.remove();
                }
            } else {
                iter.add(c);
//                iter.next();
            }
        }
        StringBuilder ans = new StringBuilder();
        for(char c:pw) {
            ans.append(c);
        }
        return ans.toString();
    }
}