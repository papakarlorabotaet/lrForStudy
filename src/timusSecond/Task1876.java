package timusSecond;

import java.io.*;

public class Task1876 {

    public static void main(String[] args) throws IOException {
        new Task1876().run();
    }

    public void run() throws IOException {
        IOUtils io = new IOUtils();
        io.writer.print(Math.max(39 * 2 + 40 + (io.readPositiveInt() - 40) * 2 + 1, io.readPositiveInt() * 2 + 40));
        io.shutdown();
    }
}
class IOUtils {

    public PrintWriter writer;
    private BufferedReader reader;

    public IOUtils() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    }

    public int read() throws IOException {
        return reader.read();
    }

    public String readLine() throws IOException {
        return reader.readLine();
    }

    public String readString() throws IOException {
        int c = reader.read();
        while (isSpaceChar(c))
            c = reader.read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = reader.read();
        } while (!isSpaceChar(c));
        return res.toString();
    }

    public int readInt() throws IOException {
        int i = 0;
        int c = reader.read();
        while (isSpaceChar(c))
            c = reader.read();
        int sign = 1;
        if (c == '-') {
            sign = -1;
            c = reader.read();
        }
        do {
            i = i * 10 + c - '0';
            c = reader.read();
        } while (!isSpaceChar(c));
        return i * sign;
    }

    public int readPositiveInt() throws IOException {
        int i = 0;
        int c = reader.read();
        while (isSpaceChar(c))
            c = reader.read();
        do {
            i = i * 10 + c - '0';
            c = reader.read();
        } while (!isSpaceChar(c));
        return i;
    }

    public void printString(char... string) {
        for (char c : string) {
            writer.print(c);
        }
    }

    public void shutdown() {
        writer.flush();
        writer.close();
    }

    public boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == -1;
    }
}

