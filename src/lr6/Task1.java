package lr6;

public class Task1 {
    public static void main(String[] args) {
        Test test = new Test("aa");
        Test test1 = new Test('a');

        test.print();
        test1.print();
    }



}
class Test{
    char character = '\u0000'; //null â char
    String string = null;
    Test(char a){
        character = a;
    }
    Test(String string){
        if(string.length() == 1){
            character = string.charAt(0);
        } else {
            this.string = string;
        }


    }
    public void print(){
        System.out.printf("char = %c , string = %s\n\n", character, string);
    }

}


