import java.util.Scanner;

public class Szamol2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Agy meg egy egesz szamot: ");
        int szam = scanner.nextInt();

        for (int i = 1; i <= 100; i++) {
            if (i == szam * 10) {
                System.out.println(i);
                break;
            }
            if (i % szam == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}