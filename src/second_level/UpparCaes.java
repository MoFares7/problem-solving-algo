package second_level;

import java.util.Scanner;

public class UpparCaes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = scanner.next();
        String r = "";


        if (w.length() > 0) {
            char firstChar = w.charAt(0);
            if (!Character.isUpperCase(firstChar)) {
                firstChar = Character.toUpperCase(firstChar);
            }
            r += firstChar;
        }

        for (int i = 1; i < w.length(); i++) {
            r += w.charAt(i);
        }

        System.out.println(r);
    }

}
