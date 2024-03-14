import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> l = new ArrayList<>();
        int r = 0;

        for (int i = 0; i < 4; i++) {
            int n = scanner.nextInt();
            l.add(n);
        }

        String c = scanner.next();

        for (int i = 0; i < c.length(); i++) {
            int e = Integer.parseInt(String.valueOf(c.charAt(i)));

            switch (e) {
                case 1: {
                    r += l.get(0);
                    break;
                }
                case 2: {
                    r += l.get(1);
                    break;
                }
                case 3: {
                    r += l.get(2);
                    break;
                }
                case 4: {
                    r += l.get(3);
                    break;
                }
            }
        }
        System.out.println(r);
    }
}
