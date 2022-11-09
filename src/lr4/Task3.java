package lr4;

public class Task3 {
    public static void main(String[] args) {
        int [][] twoDimensionArray  = {{2,2}, {2,2}};
        for(int i = 0; i < twoDimensionArray.length; i++){
            for(int j = 0; j < twoDimensionArray[i].length; j++){
                System.out.print(twoDimensionArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
