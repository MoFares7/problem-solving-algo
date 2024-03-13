package first_level;
import java.util.ArrayList;
import java.util.Scanner;

public class stonse_table {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            String t = scanner.next();
            int sum = 0;


            for (int i = 0; i < n - 1; i++) {
                if (t.charAt(i) == t.charAt(i+1)) {
                    sum++;
                }

            }
            System.out.println(sum);
        }
}
