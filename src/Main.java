import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int n = input.nextInt();

        for (int i = n; 0 < i; i--) {
            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }



    }
}