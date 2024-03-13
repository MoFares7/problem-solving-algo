package first_level;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        int n, know = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int know1 = scanner.nextInt();
            int know2 = scanner.nextInt();
            int know3 = scanner.nextInt();
            if(know1 + know2 + know3 > 1){
                know++;
            }
        }
        System.out.println(know);
    }
}