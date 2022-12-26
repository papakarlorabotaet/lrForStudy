package timus;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
public class Task1880 {
    private static final InputStream console = System.in;

    public static void main(String[] args) throws IOException {
        Set<Integer> first = new HashSet<>();
        Set<Integer> second = new HashSet<>();
        Set<Integer> third = new HashSet<>();

        int a = nextInt();
        for(int i = 0; i < a; i++) {
            first.add(nextInt());
        }

        a = nextInt();
        for(int buf, i = 0; i < a; i++) {
            if(first.contains(buf = nextInt())) {
                second.add(buf);
            }
        }
        first.clear();

        a = nextInt();
        for(int buf, i = 0; i < a; i++) {
            if(second.contains(buf = nextInt())) {
                third.add(buf);
            }
        }
        System.out.println(third.size());
    }

    private static int nextInt() throws IOException {
        StringBuilder buffer = new StringBuilder();
        char c;
        int buf;
        while ((buf = console.read()) != -1 && (c = (char) buf) >= (int) '0' && c <= (int) '9') {
            buffer.append(c);
        }

        if(buffer.length() > 0) {
            return Integer.parseInt(buffer.toString());
        }

        return nextInt();
    }
}