package lr8.example;

import java.io.File;
public class Task1 {
    public static void main(String[] args) {
        try {
            File f1=new File("MyFile1.txt");
            f1.createNewFile();
            if (f1.exists()) {
                System.out.println("Создан!!!!");
                System.out.println("Полный путь1: "+ f1.getAbsolutePath());
            }
            File f2=new File("F:\\Java\\JavaUrfuProject\\MyFile2.txt");
            f2.createNewFile();
            System.out.println( "Полный путь 2: "+ f2.getAbsolutePath());
            File f3=new File("F:\\Java\\JavaUrfuProject\\folder1\\folder2\\folder3");
            f3.mkdirs();
            System.out.println("Полный путь 3: "+ f3.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Ошибка!!! "+e);
        }
    }
}
