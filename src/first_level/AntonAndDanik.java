package first_level;

import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String s = scanner.next();

        int countAnton = 0;
        int countDanik = 0;

        for (char result : s.toCharArray()) {
            if (result == 'A') {
                countAnton++;
            } else if (result == 'D') {
                countDanik++;
            }
        }

        String winner;
        if (countAnton > countDanik) {
            winner = "Anton";
        } else if (countAnton < countDanik) {
            winner = "Danik";
        } else {
            winner = "Friendship";
        }

        System.out.println(winner);
    }
}
