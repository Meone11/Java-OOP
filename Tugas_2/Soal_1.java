import java.util.Scanner;

public class Soal_1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("num1 + num2 = " + (num1+num2));
        System.out.println("num1 - num2 = " + (num1-num2));
        System.out.println("num1 * num2 = " + (num1*num2));
        System.out.println("num1 / num2 = " + ((float)num1/num2));
        System.out.println("num1 % num2 = " + (num1%num2));

    }
}