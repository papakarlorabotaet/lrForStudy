package timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1585 {

    public static void main(String[] args) throws NumberFormatException,
            IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                System.in));
        int count = Integer.parseInt(reader.readLine());
        int e = 0, m = 0, l = 0;
        char pinguins[] = new char[count];
        for (int i = 0; i < count; i++) {
            pinguins[i] = reader.readLine().charAt(0);
        }
        for (int pinguin : pinguins) {
            switch (pinguin) {
                case 'E':
                    e++;
                    break;
                case 'M':
                    m++;
                    break;
                default:
                    l++;
                    break;
            }
        }
        if (e > m) {
            if (e > l) {
                System.out.println("Emperor Penguin");
            } else {
                System.out.println("Little Penguin");
            }
        } else {
            if (m > l) {
                System.out.println("Macaroni Penguin");
            } else {
                System.out.println("Little Penguin");
            }
        }
    }
}
