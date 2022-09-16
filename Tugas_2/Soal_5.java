import java.util.Scanner;

/**
 * Soal_5
 */
public class Soal_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 1 ; i <= n ; i ++){
            if ( ((i % 2) == 0) ){
                if (i % 6 == 0 ){
                    continue;
                }
                System.out.println(i);
            }
        }
    }
}