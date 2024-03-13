package first_level;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;;

public class gravity_flip {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();

            int[] cubs = new int[n];
            int temp=0;

            for (int c = 0; c < n; c++) {
                cubs[c] = scanner.nextInt();
            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (cubs[j] > cubs[j + 1]) {
                        temp = cubs[j];
                        cubs[j] = cubs[j + 1];
                        cubs[j + 1] = temp;
                    }
                }
            }

            for(int i=0; i< n; i++){
                System.out.println(cubs[i]);
            }
        }
    }

