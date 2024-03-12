import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
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