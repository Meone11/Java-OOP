import java.util.Scanner;

public class Soal_2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();

        if ( n >= 87 ){
            System.out.println("Nilai Huruf");               
            System.out.println("  A  | 4.00");            
        }
        else if ( n < 87 && n >= 78 ){
            System.out.println("Nilai Huruf");               
            System.out.println(" AB  | 3.50");
        }
        else if ( n < 78 && n >= 69 ){
            System.out.println("Nilai Huruf");               
            System.out.println("  B  | 3.00");     
        }
        else if ( n < 69 && n >= 60 ){
            System.out.println("Nilai Huruf");               
            System.out.println(" BC  | 2.50");      
        }
        else if ( n < 60 && n >= 51 ){
            System.out.println("Nilai Huruf");               
            System.out.println("  C  | 2.00");     
        }
        else if ( n < 51 && n >= 41 ){
            System.out.println("Nilai Huruf");               
            System.out.println("  D  | 1.00");     
        }
        else{
            System.out.println("Nilai Huruf");               
            System.out.println("  E  | 0.00");     
        }

    }
}