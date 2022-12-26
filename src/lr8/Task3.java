package lr8;

import java.io.*;

public class Task3{
    static boolean isGlas(char CH){
        if (CH=='А' || CH=='а' || CH=='О' || CH=='о' || CH=='У' || CH=='у' || CH=='Ы' || CH=='ы' || CH=='Э' || CH=='э' || CH=='Е' || CH=='е' || CH=='Ё' || CH=='ё' || CH=='И' || CH=='и' || CH=='Ю' || CH=='ю' || CH=='Я' || CH=='я'){
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader rd = null;
        BufferedWriter wd = null;
        try {
            rd = new BufferedReader(new InputStreamReader(new FileInputStream("MyFile3Input.txt"),"UTF8"));
            wd = new BufferedWriter(new BufferedWriter(new FileWriter("MyFile3Output.txt")));
            String strTMP = null;
            String[] MF = null;
            int counterLine = 0;
            int counterString = 0;
            while (true) {
                counterString++;
                strTMP = rd.readLine();
                if (strTMP != null && !strTMP.isEmpty()){
                    MF = strTMP.split(" ");
                    for (int i = 0; i < MF.length; i++){
                        if (isGlas(MF[i].charAt(0))) {
                            wd.write(MF[i]+" ");
                            counterLine++;
                        }
                    }
                    wd.write("\t\\\\всего выбрано " + counterLine +" слов(а), слова находились в строке под номером " + counterString);
                    wd.newLine();
                    counterLine = 0;
                }else if (strTMP == null){
                    break;
                }
            }
        } catch (IOException e){
            System.out.println("ошибка "+e);
        } finally {
            rd.close();
            wd.flush();
            wd.close();
        }
    }
}