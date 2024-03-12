package first_level;

import java.util.Scanner;

public class BearAndBob {

        public static void main(String[] args) {
            int a , b , years = 0;
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            b = scanner.nextInt();

            while(a <= b){
                a = a * 3;
                b = b * 2;
                years++;
            }
            System.out.println(years);
        }
    }

