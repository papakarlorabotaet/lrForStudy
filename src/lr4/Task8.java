package lr4;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = id.nextLine();

        System.out.print("Enter num key: ");
        int shift;
        int a = 0;
        if(id.nextInt() < 32){
            a = id.nextInt();
        } else {
            a = id.nextInt() % 32;
        }
        shift = a;



        String encryptStr = Caeser.encrypt(text, shift);

        System.out.print("Text after changes :" + "\"" + encryptStr + "\"");

        System.out.println("Do reverse changes (y/n)");
        boolean cool = false;
        while (!cool) {
            String reply = id.next();

            if (reply.toLowerCase().equals("y")) {
                String decryptStr = Caeser.decrypt(encryptStr, shift);
                System.out.println(decryptStr);
                cool = true;
            }

            else if (reply.toLowerCase().equals("n")) {
                System.out.println("До свидания!");
                cool = true;
            }

            else {
                System.out.println("Введите корректный ответ: ");
                cool = false;
            }
        }
    }
    private static class Caeser {
        static String encryptText = "";
        static String deCryptText = "";
        private static int c = 0;
        private static int y = 0;

        private static String encrypt(String enText, int key)
        {
            char[] ArrayText = enText.toCharArray();


            for (int i = 0; i < ArrayText.length; i++) {
                if (ArrayText[i] == 32){
                    encryptText += ' ';
                    continue;
                }
                else {
                    c =  (ArrayText[i] + key);
                }
                y = (c - 1072) % 32 + 1072;
                encryptText += (char) y;
            }

            return encryptText;
        }

        private static String decrypt(String enText, int key)
        {
            char[] ArrayText = enText.toCharArray();
            for (int i = 0; i < ArrayText.length; i++) {
                if (ArrayText[i] == 32){
                    deCryptText += ' ';
                    continue;
                }
                else {
                    c =  (ArrayText[i] - key);
                }
                y = (c - 1072) % 32 + 1072;
                deCryptText += (char) y;
            }

            return deCryptText;
        }
    }

}
