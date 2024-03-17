import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> colors = new HashSet<>();

        // Read the colors of the horseshoes Valera has
        for (int i = 0; i < 4; i++) {
            int color = scanner.nextInt();
            colors.add(color);
        }

        // Calculate the number of additional horseshoes Valera needs to buy
        int horseshoesToBuy = 4 - colors.size();

        // Output the result
        System.out.println(Math.max(horseshoesToBuy, 0));
    }
}



//import java.util.ArrayList;
//        import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> l = new ArrayList<>();
//        int number = 10;
//        int multiples = 0;
//        int count =0;
//
//        for(int i =0; i< 2; i++){
//            int priceSh = scanner.nextInt();
//            l.add(priceSh);
//        }
//
//        for(int  j =1; j <= 10; j++){
//            int numSh = l.get(0) * j;
//            if((numSh % 10) == 0 || (numSh % 10) == l.get(1) ){
//                count = j;
//                break;
//            }
//        }
//        System.out.println(count);
//    }
//}
