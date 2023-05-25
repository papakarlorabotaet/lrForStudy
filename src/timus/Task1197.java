package timus;

import java.util.Scanner;

public class Task1197 {

    static boolean isHere(String[] There, String STR){
        int i = 0;
        while (i < There.length){
            if (There[i].equals(STR)){
                return true;
            }
            i++;
        }
        return false;
    };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] dos = {
                "a1", "h1", "a8", "h8"
        };
        String[] tres = {
                "a2", "b1", "g1", "h2", "g8", "h7", "b8", "a7"
        };
        String[] cuatro = {
                "a3","a4","a5","a6","c1","d1","e1","f1","h3","h4","h5","h6","c8","d8","e8","f8","b2","g2","b7","g7"
        };
        String[] seis = {
                "c2","d2","e2","f2","b3","b4","b5","b6","c7","d7","e7","f7","g3","g4","g5","g6"
        };
        String[] ocho = {
                "c3","d3","e3","f3","c4","d4","e4","f4","c5","d5","e5","f5","c6","d6","e6","f6"
        };

        int counter = in.nextInt()+1;
        String[] value = new String[counter];
        for (int i=0; i < value.length; i ++){
            value[i] = in.nextLine();
        }

        //вывод
        for (int i=0; i < value.length; i ++){
            if (isHere(dos,value[i])){
                System.out.println(2);
            } else if (isHere(tres,value[i])){
                System.out.println(3);
            } else if (isHere(cuatro,value[i])) {
                System.out.println(4);
            } else if (isHere(seis,value[i])) {
                System.out.println(6);
            }else if (isHere(ocho,value[i])) {
                System.out.println(8);
            }
        }
    }
}