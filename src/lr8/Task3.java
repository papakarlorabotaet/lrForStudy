package lr8;

import java.io.*;

public class Task3{
    static boolean isGlas(char CH){
        if (CH=='�' || CH=='�' || CH=='�' || CH=='�' || CH=='�' || CH=='�' || CH=='�' || CH=='�' || CH=='�' || CH=='�' || CH=='�' || CH=='�' || CH=='�' || CH=='�' || CH=='�' || CH=='�' || CH=='�' || CH=='�' || CH=='�' || CH=='�'){
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
                    wd.write("\t\\\\����� ������� " + counterLine +" ����(�), ����� ���������� � ������ ��� ������� " + counterString);
                    wd.newLine();
                    counterLine = 0;
                }else if (strTMP == null){
                    break;
                }
            }
        } catch (IOException e){
            System.out.println("������ "+e);
        } finally {
            rd.close();
            wd.flush();
            wd.close();
        }
    }
}