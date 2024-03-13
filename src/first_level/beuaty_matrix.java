package first_level;
import java.util.Scanner;

public class beuaty_matrix {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[][] t = new int[5][5];
            int rowIndex = -1;
            int colIndex = -1;

            for (int i = 0; i < t.length; i++) {
                for (int j = 0; j < t[i].length; j++) {
                    t[i][j] = scanner.nextInt();
                    if (t[i][j] == 1) {


                        int t1 = 0;
                        int t2 = 0;

                        t1 = Math.abs(2 - i);
                        t2 = Math.abs(2 - j);

                        System.out.println(t1 + t2);
                        break;
                    }
                }
                if (rowIndex != -1 && colIndex != -1) {
                    break;
                }
            }
    }

}
