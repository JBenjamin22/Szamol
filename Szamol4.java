import java.util.Scanner;

public class Szamol4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adja meg az elso szamot: ");
        int szam1 = scanner.nextInt();
        System.out.print("Adja meg a masodik szamot: ");
        int szam2 = scanner.nextInt();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                continue;
            }

            if (i % szam1 == 0 && i % szam2 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % szam1 == 0) {
                System.out.println("Fizz");
            } else if (i % szam2 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}