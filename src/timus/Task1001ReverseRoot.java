package timus;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task1001ReverseRoot {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        // decision

        int MAX_SIZE = 262144;
        int bytes = 0;
        StringBuffer sb = new StringBuffer();
        String digit = "";
        List<Long> digits = new ArrayList<>();

        while (bytes <= MAX_SIZE) {
            sb = sb.append((char) System.in.read());
            bytes++;
        }
        for (int i = 0; i < sb.length(); i++) {

            if (Character.isDigit(sb.charAt(i))) {
                digit = digit + sb.charAt(i);
            } else {
                if (!digit.isEmpty()) {
                    digits.add(Long.parseLong(digit));
                    digit = "";
                }
            }
        }
        for (int y = digits.size() - 1; y >= 0; y--) {

            DecimalFormat df = new DecimalFormat("0.0000");
            String num = df.format(Math.sqrt(digits.get(y)));
            System.out.println(num);
        }

        // decision

        out.println();
        out.flush();
    }
}
