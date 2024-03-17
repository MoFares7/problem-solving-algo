package second_level;
import java.util.Scanner;

public class NightAtTheMuseum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letters = "abcdefghijklmnopqrstuvwxyz";
        char currentLetter = 'a';
        int sum = 0;
        String text = scanner.next();

        for (int i = 0; i < text.length() ; i++) {

            char letter = text.charAt(i);
            int index = letters.indexOf(letter);
            int clockwise = (letter - currentLetter + 26) % 26;
            int counterclockwise = (currentLetter - letter + 26) % 26;

            sum += Math.min(clockwise , counterclockwise);

            currentLetter = letter;

        }
        System.out.println(sum);

    }
}
