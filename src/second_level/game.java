package second_level;
import java.util.ArrayList;
import java.util.Scanner;

public class game {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            ArrayList<Integer> homeUniformColors = new ArrayList<>();
            ArrayList<Integer> guestUniformColors = new ArrayList<>();

            int count = 0;
            int n = scanner.nextInt();

            for(int i = 0; i < n; i++) {
                int homeColor = scanner.nextInt();
                int guestColor = scanner.nextInt();

                homeUniformColors.add(homeColor);
                guestUniformColors.add(guestColor);
            }

            for(int i = 0; i < homeUniformColors.size(); i++){
                for(int j = 0; j < guestUniformColors.size(); j++){
                    if(homeUniformColors.get(i) == guestUniformColors.get(j)){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
}
